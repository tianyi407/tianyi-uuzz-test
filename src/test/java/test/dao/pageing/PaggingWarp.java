/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.pageing;


/** 
 * 类 名: PaggingWarp
 * 描 述: oracle 使用rownum形式进行sql的包装，用于进行物理分页
 * 作 者: 程凯
 * 创 建：2013-5-30
 * 历 史: (版本) 作者 时间 注释 
 */
public class PaggingWarp implements SqlWarp{
	private int rowIndex;
	private int pageSize;
	
	public PaggingWarp(int rowIndex, int pageSize) {
		super();
		this.rowIndex = rowIndex;
		this.pageSize = pageSize;
	}
	
	@Override
	public String warp(String originalSql) {
		return this.getPagingSql(originalSql, rowIndex, pageSize);
	}
	/**
	 * sql包装成rownum 分页形式
	 */
	private String getPagingSql(String sql, int rowIndex, int pageSize) {
		int m = rowIndex;
		int n = m + pageSize;
		return String.format("select * from ( select row_.*, rownum rownum_$$_ from ( %s ) row_ where rownum <= %s ) where rownum_$$_ > %s ", sql, n, m);
	}
	
}
