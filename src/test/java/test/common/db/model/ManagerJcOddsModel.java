// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.db.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 类 名: ManagerJcOddsModel<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class ManagerJcOddsModel implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 773824365876754684L;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public long getPoolId() {
	return poolId;
    }

    public void setPoolId(long poolId) {
	this.poolId = poolId;
    }

    public String getSel() {
	return sel;
    }

    public void setSel(String sel) {
	this.sel = sel;
    }

    public String getOddsType() {
	return oddsType;
    }

    public void setOddsType(String oddsType) {
	this.oddsType = oddsType;
    }

    public double getOddsValue() {
	return oddsValue;
    }

    public void setOddsValue(double oddsValue) {
	this.oddsValue = oddsValue;
    }

    public String getSelState() {
	return selState;
    }

    public void setSelState(String selState) {
	this.selState = selState;
    }

    public Date getIssueTime() {
	return issueTime;
    }

    public void setIssueTime(Date issueTime) {
	this.issueTime = issueTime;
    }

    public Date getCreateTime() {
	return createTime;
    }

    public void setCreateTime(Date createTime) {
	this.createTime = createTime;
    }

    public Date getUpdateTime() {
	return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
    }

    public long getMatchId() {
	return matchId;
    }

    public void setMatchId(long matchId) {
	this.matchId = matchId;
    }

    private long id;
    private long poolId;
    private String sel;
    private String oddsType;
    private double oddsValue;
    private String selState;
    private Date issueTime;
    private Date createTime;
    private Date updateTime;
    private long matchId;

}
