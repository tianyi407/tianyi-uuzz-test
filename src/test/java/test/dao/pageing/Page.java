/**
 * Copyright 2013 北京壹平台科技有限公司 
 */
package test.dao.pageing;

import java.util.ArrayList;
import java.util.List;

/** 
 * 类 名: Page
 * 描 述: 分页对象
 * 作 者: 程凯
 * 创 建：2013-5-30
 * 历 史: (版本) 作者 时间 注释 
 */
public class Page {

	private int pageIndex; // 页索引, 索引编号从0开始
	private int pageSize; // 每页行数
	private int total; // 总记录数
	private List<Object>  rows = new ArrayList<Object>(); // 当前页数据

	public Page(int pageIndex, int pageSize) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	/**
	 * 获取行索引
	 */
	public int getRowIndex() {
		return this.pageIndex * this.pageSize;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public List<Object> getRows() {
		return rows;
	}

	public void setRows(List<Object> rows) {
		this.rows = rows;
	}

}
