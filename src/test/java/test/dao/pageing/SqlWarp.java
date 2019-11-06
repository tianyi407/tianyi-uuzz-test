/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.pageing;


/** 
 * 类 名: SqlWarp
 * 描 述: Sql包装接口
 * 作 者: 程凯
 * 创 建：2013-5-30
 * 历 史: (版本) 作者 时间 注释 
 */
public interface SqlWarp {
	/**
	 * 包装sql
	 */
	public String warp(String originalSql);
}