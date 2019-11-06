/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import test.dao.pageing.Iquery;
import test.dao.pageing.Page;
import test.dao.pageing.PaggingWarp;
import test.dao.pageing.PagingSqlProxy;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.scope.SessionScope;
import com.ibatis.sqlmap.engine.scope.StatementScope;
import com.uuzz.utils.logs.UUZZLog;

/**
 * 类 名: IbatisDAO.java</br>
 * 描 述: 数据操作DAO父类</br>
 * 创 建： 2014年6月18日</br>
 *
 * 历 史: (版本) 作者 时间 注释</br>
 */
@SuppressWarnings({ "rawtypes", "deprecation" })
public class IbatisDAO extends SqlMapClientDaoSupport {

	private static final Logger LOG = UUZZLog.DAO_LOGGER;

	@Resource(name = "sqlMapClient")
	private SqlMapClient sqlMapClient;

	@PostConstruct
	public void initSqlMapClient() {
		super.setSqlMapClient(sqlMapClient);
	}
	
	/**
	 * 描 述： 查询结果集数量(不带参数)
	 * 作 者：程凯
	 * 历 史: (版本) 作者 时间 注释 
	 * @param id   ibatis 查询的id
	 * @return  结果集数量
	 * @throws SQLException
	 */
	public int queryCount(String id) throws SQLException{
		return this.queryCount(id,null);
	}
	/**
	 * 描 述： 查询结果集数量
	 * 作 者：程凯
	 * 历 史: (版本) 作者 时间 注释 
	 * @param id   ibatis 查询的id
	 * @param params  参数
	 * @return  结果集数量
	 * @throws SQLException
	 */
	public int queryCount(String id,Object params) throws SQLException{
		
		SqlMapClientImpl sqlMapClientImpl = (SqlMapClientImpl) this.sqlMapClient;
		MappedStatement mappedStatement = sqlMapClientImpl.getMappedStatement(id);
		Sql dySql = mappedStatement.getSql();
		
		SessionScope sessionScope=new SessionScope();
	    StatementScope statementScope = new StatementScope(sessionScope);
	    sessionScope.incrementRequestStackDepth();
	    mappedStatement.initRequest(statementScope);
	    
	    Object[] parameters=null;
	    //包装sql
	    String sql =dySql.getSql(statementScope, params);
	    try {
		    if(params!=null){
					//获取sql参数
				    ParameterMap parameterMap = dySql.getParameterMap(statementScope, params);
				    parameters = parameterMap.getParameterObjectValues(statementScope, params);
		    }
	    } finally {
	    	sessionScope.decrementRequestStackDepth();
	    	sessionScope.cleanup();
	    }
	    /**********jdbc 查询************/
	    
		return this.querySqlCount(sql, parameters);
	
	}

	/**
	 * 描 述：根据select sql 包装一层获取结果集数量
	 * 作 者：程凯
	 * 历 史: (版本) 作者 时间 注释 
	 * @param selectSql 查询sql
	 * @param params    参数
	 * @return
	 * @throws SQLException
	 */
	public int querySqlCount(String selectSql,Object... params) throws SQLException{
		String byname="cnt";
		String newsql =String.format(" select count(1) as %s from ( %s ) ", byname,selectSql);
		
		Connection conn = this.sqlMapClient.getCurrentConnection(); // 
		PreparedStatement st=null;
		ResultSet rs = null;
		try{
			if(conn==null){
				conn = this.sqlMapClient.getDataSource().getConnection();
			}
			st = conn.prepareStatement(newsql);
			//设置参数
			if(params!=null && params.length!=0){
				for(int cindex=0 ; cindex<params.length ; cindex++){
					st.setObject(cindex+1, params[cindex]);
				}
			}
	        rs = st.executeQuery();  
	        rs.next();
	        int result = rs.getInt(byname);
	        return result;
		}finally{
			if(null == this.sqlMapClient.getCurrentConnection()){
				this.jdbcFree(conn,st, rs);
			}else{
				this.jdbcFree(null,st, rs);
			}
		}
		
	}
	
	/**
	 * 关闭jdbc
	 */
	protected void jdbcFree(Connection conn ,Statement st, ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				LOG.error("ResultSet 未正常关闭",e);
			}
		}
		if(st!=null){
			try{
				st.close();
			}catch(SQLException e){
				LOG.error("Statement 未正常关闭",e);
			}
		}
		if(conn!=null){
			try{
				conn.close();
			}catch(SQLException e){
				LOG.error("Connection 未正常关闭",e);
			}
		}
		
		
	}

	/**
	 * page对象 分页
	 * @param id  ibatis id
	 * @param pageObj page 分页参数对象
	 * @param params  参数
	 * @return page
	 * @throws SQLException
	 */
	@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
	public Page queryPaging(String id, Page pageObj, Object params ) throws SQLException{
		
		@SuppressWarnings("unchecked")
		List<Object> rows = this.queryPaging(id, pageObj.getRowIndex(), pageObj.getPageSize(), params);
		int total = this.queryCount(id, params);
		pageObj.setRows(rows);
		pageObj.setTotal(total);
		return pageObj;
	}
	
	/**
	 * 分页查询
	 * @param id 
	 * @param rowIndex 行索引
	 * @param rowSize 获取的行数
	 * @return 返回集合列表
	 * @throws SQLException
	 */
	public List queryPaging(final String id, int rowIndex, int rowSize) throws SQLException {

		return (List) this.queryPaging(id, rowIndex, rowSize, new Iquery() {
			@Override
			public Object query() throws SQLException {
				// 查询
				return sqlMapClient.queryForList(id);
			}
		});
	}

	/**
	 * 分页查询
	 * @param id
	 * @param rowIndex 
	 * @param rowSize
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public List queryPaging(final String id, int rowIndex, int rowSize, final Object param) throws SQLException {

		return (List) this.queryPaging(id, rowIndex, rowSize, new Iquery() {
			@Override
			public Object query() throws SQLException {
				// 查询
				return sqlMapClient.queryForList(id, param);
			}
		});
	}

	/**
	 * 分页查询
	 * @param id
	 * @param rowIndex
	 * @param rowSize
	 * @param iquery
	 * @return
	 * @throws SQLException
	 */
	public Object queryPaging(String id, int rowIndex, int rowSize, Iquery iquery) throws SQLException {
		SqlMapClientImpl sqlMapClientImpl = (SqlMapClientImpl) this.sqlMapClient;
		MappedStatement mappedStatement = sqlMapClientImpl.getMappedStatement(id);
		Sql dySql = mappedStatement.getSql();

		PaggingWarp pwarp = new PaggingWarp(rowIndex, rowSize);

		PagingSqlProxy sqlProxy = PagingSqlProxy.getSqlProxy(dySql, pwarp);
		mappedStatement.setSql(sqlProxy);
		try {
			return iquery.query();
		} finally {
			PagingSqlProxy.clearPaggingWarp();
			mappedStatement.setSql(dySql);
		}
	}
	
	

	/**
	 * 描 述：批量插入记录操作<br/>
	 * 作 者：刘闰<br/>
	 * 历 史: (版本) 作者 时间 注释 <br/>
	 * 
	 * @param sqlId
	 * @param instances
	 * @return boolean
	 * @throws Exception
	 */
	public boolean batchInsert(final String sqlId, final List instances) throws Exception {
		SqlMapClient client = getSqlMapClientTemplate().getSqlMapClient();
		boolean result = false;
		try {
			int batch = 0;
			client.startTransaction();
			client.startBatch();
			for (Object instance : instances) {
				client.insert(sqlId, instance);
				// handler.process(client, sqlId, instance);
				batch++;
				// 每500条批量提交一次。
				if (batch == 500) {
					client.executeBatch();
					batch = 0;
				}
			}
			client.executeBatch();
			client.commitTransaction();
			result = true;
		} catch (Exception e) {
			LOG.error("批量操作失败", e);
			throw new Exception("批量操作失败", e);
		} finally {
			try {
				sqlMapClient.endTransaction();
			} catch (Exception e) {
				LOG.error("批量插入记录操作异常", e);
			}
		}
		return result;
	}

	/**
	 * 描 述：批量更新记录操作<br/>
	 * 作 者：刘闰<br/>
	 * 历 史: (版本) 作者 时间 注释 <br/>
	 * 
	 * @param sqlId
	 * @param instances
	 * @return boolean
	 * @throws Exception
	 */
	public boolean batchUpdate(String sqlId, List instances) throws Exception {
		SqlMapClient client = getSqlMapClientTemplate().getSqlMapClient();
		boolean result = false;
		try {
			int batch = 0;
			client.startTransaction();
			client.startBatch();
			for (Object instance : instances) {
				client.update(sqlId, instance);
				// handler.process(client, sqlId, instance);
				batch++;
				// 每500条批量提交一次。
				if (batch == 500) {
					client.executeBatch();
					batch = 0;
				}
			}
			client.executeBatch();
			client.commitTransaction();
			result = true;
		} catch (Exception e) {
			LOG.error("批量操作失败", e);
			throw new Exception("批量操作失败", e);
		} finally {
			try {
				sqlMapClient.endTransaction();
			} catch (Exception e) {
				LOG.error("sqlMapClient.endTransaction()异常", e);
			}
		}
		return result;
	}
}
