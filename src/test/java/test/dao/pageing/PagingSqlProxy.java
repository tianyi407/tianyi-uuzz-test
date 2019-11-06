/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.pageing;

import com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap;
import com.ibatis.sqlmap.engine.mapping.result.ResultMap;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.scope.StatementScope;


/** 
 * 类 名: PagingSqlProxy
 * 描 述: sql 接口代理， 用于返回经过嵌套分页的sql
 * 作 者: 程凯
 * 创 建：2013-5-30
 * 历 史: (版本) 作者 时间 注释 
 */
public final class PagingSqlProxy implements Sql {

	private Sql sqlobj = null;
	// 静态ThreadLocal 避免并发时产生错误
	private static ThreadLocal<PaggingWarp> localParams = new ThreadLocal<PaggingWarp>();

	public static PagingSqlProxy getSqlProxy(Sql sqlobj, PaggingWarp sqlWap) {
		if (null == sqlobj) {
			return null;
		}
		PagingSqlProxy sqlProxy = null;

		// sql对象 非PagingSqlProxy 时进行包装
		if (sqlobj instanceof PagingSqlProxy) {
			sqlProxy = (PagingSqlProxy) sqlobj;
		} else {
			sqlProxy = new PagingSqlProxy(sqlobj);
		}
		PagingSqlProxy.setWarp(sqlWap);

		return sqlProxy;
	}

	private static void setWarp(PaggingWarp sqlWap) {
		localParams.set(sqlWap);
	}

	public static void clearPaggingWarp() {
		localParams.remove();
	}

	private PagingSqlProxy(Sql sqlobj) {
		this.sqlobj = sqlobj;
	}

	@Override
	public String getSql(StatementScope statementScope, Object parameterObject) {

		String sql = this.sqlobj.getSql(statementScope, parameterObject);
		PaggingWarp pbean = localParams.get();
		if (pbean != null) {
			return pbean.warp(sql);
		}
		return sql;
	}

	@Override
	public ParameterMap getParameterMap(StatementScope statementScope, Object parameterObject) {
		return this.sqlobj.getParameterMap(statementScope, parameterObject);
	}

	@Override
	public ResultMap getResultMap(StatementScope statementScope, Object parameterObject) {
		return this.sqlobj.getResultMap(statementScope, parameterObject);
	}

	@Override
	public void cleanup(StatementScope statementScope) {
		this.sqlobj.cleanup(statementScope);
	}

	public Sql getSqlobj() {
		return sqlobj;
	}
}
