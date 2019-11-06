// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.db.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 类 名: ManagerJcPoolModel<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class ManagerJcPoolModel implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -3634049806559095931L;
    
    
    public long getPoolId() {
	return poolId;
    }

    public String getGameCode() {
	return gameCode;
    }

    public String getHandicap() {
	return handicap;
    }

    public Date getSaleEndTime() {
	return saleEndTime;
    }

    public long getMatchId() {
	return matchId;
    }

    public String getResult() {
	return result;
    }

    public String getPoolState() {
	return poolState;
    }

    public String getChannelState() {
	return channelState;
    }

    public String getSysSaleState() {
	return sysSaleState;
    }

    public Date getSysSaleEndTime() {
	return sysSaleEndTime;
    }

    public String getAllUp() {
	return allUp;
    }

    public String getSingle() {
	return single;
    }

    public String getChnlAllUp() {
	return chnlAllUp;
    }

    public String getChnlSingle() {
	return chnlSingle;
    }

    public void setPoolId(long poolId) {
        this.poolId = poolId;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setPoolState(String poolState) {
        this.poolState = poolState;
    }

    public void setChannelState(String channelState) {
        this.channelState = channelState;
    }

    public void setSysSaleState(String sysSaleState) {
        this.sysSaleState = sysSaleState;
    }

    public void setSysSaleEndTime(Date sysSaleEndTime) {
        this.sysSaleEndTime = sysSaleEndTime;
    }


    public void setAllUp(String allUp) {
        this.allUp = allUp;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public void setChnlAllUp(String chnlAllUp) {
        this.chnlAllUp = chnlAllUp;
    }

    public void setChnlSingle(String chnlSingle) {
        this.chnlSingle = chnlSingle;
    }
    
    public String getSportNo() {
        return sportNo;
    }

    public void setSportNo(String sportNo) {
        this.sportNo = sportNo;
    }

    public String getOddsType() {
        return oddsType;
    }

    public void setOddsType(String oddsType) {
        this.oddsType = oddsType;
    }

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
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

    private long poolId;
    private String gameCode;
    private String handicap;
    private Date saleEndTime;
    private long matchId;
    private String result;
    private String poolState;
    private String channelState;
    private String sysSaleState;
    private Date sysSaleEndTime;
    private String sportNo;
    private String allUp;
    private String single;
    private String chnlAllUp;
    private String chnlSingle;
    private String oddsType;
    private Date initialTime;
    private Date createTime;
    private Date updateTime;

}
