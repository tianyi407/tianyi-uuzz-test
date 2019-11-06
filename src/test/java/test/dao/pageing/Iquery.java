/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.pageing;

import java.sql.SQLException;

/** 
 * 类 名: Iquery
 * 描 述: 用于分页查询的子传递对象
 * 作 者: 程凯
 * 创 建：2013-5-30
 * 历 史: (版本) 作者 时间 注释 
 */
public interface Iquery {
	public Object query() throws SQLException;
}
