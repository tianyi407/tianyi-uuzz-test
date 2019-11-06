// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import test.common.db.model.BetRecordModel;
import test.common.util.SpringUtil;
import test.dao.impl.TradeJikaiRecordDao;
import test.dao.impl.TradePeriodRecordDao;
import test.dao.impl.TradeSportRecordDao;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.manager.IceServiceProxy;
import com.uuzz.lottery.manager.service.SentServiceToPassportPrx;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: QueryBetRecordVo<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月4日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class QueryBetRecordVo {

    // 玩法类型枚举
    private GameTypeEnum gameType;

    // 代销者编号
    private String agentNo;

    // 期望各状态数据条数
    private int wantCount = 1;

    // 实际请求查询的票数（排重后）
    private int realCount;

    // 请求刮开的agentSid列表
    private List<BetRecordModel> agentSidList;

    // 是否从数据库获取真实agentSid进行测试
    private boolean isGetAgentSidFromDB = true;

    // 是否包含不存在的投注记录
    private boolean isContainNoExistRecord = false;

    // 是否包含重复的投注记录号
    private boolean isContainDuplicateRecord = false;

    // 是否包含其他代销者编号
    private boolean isContainOtherAgentNo = false;

    public QueryBetRecordVo(GameTypeEnum gameType) {
	this.gameType = gameType;
    }

    /**
     * 描 述：根据VO设置，填充对应的代销者编号和代销者流水号，作为请求入参<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return List of BetRecordModel
     */
    public List<BetRecordModel> fillQueryBetRecordModel() {
	this.fillDBRecord();
	this.fillNoExistRecord();
	this.fillDuplicateRecord();
	this.fillOtherAgentRecord();
	return this.getAgentSidList();
    }

    private void fillDBRecord() {
	if (isGetAgentSidFromDB) {
	    List<BetRecordModel> dbAgentSidList = null;

	    if (gameType.equals(GameTypeEnum.JK)) {
		TradeJikaiRecordDao dao = (TradeJikaiRecordDao) SpringUtil
			.getApplicationContext().getBean("tradeJikaiRecordDao");
		dbAgentSidList = dao.queryEachStateAgentSidJk(wantCount);
	    } else if (gameType.equals(GameTypeEnum.DC)) {
		TradePeriodRecordDao dao = (TradePeriodRecordDao) SpringUtil
			.getApplicationContext()
			.getBean("tradePeriodRecordDao");
		dbAgentSidList = dao.queryEachStateAgentSidLt(wantCount);
	    } else if (gameType.equals(GameTypeEnum.CTZC)) {
		TradeSportRecordDao dao = (TradeSportRecordDao) SpringUtil
			.getApplicationContext().getBean("tradeSportRecordDao");
		dbAgentSidList = dao.queryEachStateAgentSidCtzc(wantCount);
	    } else if (gameType.equals(GameTypeEnum.JCZQ)) {
		TradeSportRecordDao dao = (TradeSportRecordDao) SpringUtil
			.getApplicationContext().getBean("tradeSportRecordDao");
		dbAgentSidList = dao.queryEachStateAgentSidJczq(wantCount);
	    } else {
		System.out.println("=====ERROR -- 玩法类型无法识别，没有从DB查询数据！！");
	    }

	    this.addAgentSid(dbAgentSidList);
	} else {
	    for (int i = 0; i < wantCount; i++) {
		BetRecordModel model = this.buildNoExsitModel();
		this.addAgentSid(model);
	    }
	}
    }

    private void fillNoExistRecord() {
	if (isContainNoExistRecord) {
	    for (int i = 0; i < wantCount; i++) {
		BetRecordModel model = this.buildNoExsitModel();
		this.addAgentSid(model);
	    }
	}
    }

    private void fillDuplicateRecord() {
	if (isContainDuplicateRecord) {
	    int lastIndex = this.getAgentSidList().size() - 1;
	    BetRecordModel model = this.getAgentSidList().get(lastIndex);
	    try {
		BetRecordModel modelClone = (BetRecordModel) model.clone();
		this.addAgentSid(modelClone);
	    } catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	    for (int i = 1; i < wantCount; i++) {
		model = this.getAgentSidList().get(i);
		try {
		    BetRecordModel modelClone = (BetRecordModel) model.clone();
		    this.addAgentSid(modelClone);
		} catch (CloneNotSupportedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
    }

    private void fillOtherAgentRecord() {
	if (isContainOtherAgentNo) {
	    for (int i = 0; i < wantCount; i++) {
		BetRecordModel model = this.getAgentSidList().get(i);
		try {
		    BetRecordModel modelClone = (BetRecordModel) model.clone();
		    modelClone.setAgentNo(modelClone.getAgentNo() + "T");
		    this.addAgentSid(modelClone);
		} catch (CloneNotSupportedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
    }

    private BetRecordModel buildNoExsitModel() {
	BetRecordModel model = new BetRecordModel();
	String agentNo = this.getAgentNo();
	String agentSid = UUID.randomUUID().toString();
	model.setAgentNo(agentNo);
	model.setAgentSerial(agentSid);
	return model;
    }

    public boolean isContainOtherAgentNo() {
	return isContainOtherAgentNo;
    }

    public void setContainOtherAgentNo(boolean isContainOtherAgentNo) {
	this.isContainOtherAgentNo = isContainOtherAgentNo;
    }

    /**
     * 描 述：获取实际请求查询的票数（排重后）<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    public int getRealCount() {
	if (realCount == 0) {
	    List<BetRecordModel> list1 = this.getAgentSidList();
	    List<BetRecordModel> list2 = new ArrayList<BetRecordModel>();
	    for (BetRecordModel model1 : list1) {
		boolean isContain = false;
		for (BetRecordModel model2 : list2) {
		    String agentNo1 = model1.getAgentNo();
		    String agentSid1 = model1.getAgentSerial();

		    String agentNo2 = model2.getAgentNo();
		    String agentSid2 = model2.getAgentSerial();

		    if (agentNo1.equals(agentNo2)
			    && agentSid1.equals(agentSid2)) {
			isContain = true;
			break;
		    }
		}
		if (!isContain) {
		    list2.add(model1);
		}
	    }

	    realCount = list2.size();
	}
	return realCount;
    }

    public void setRealCount(int realCount) {
	this.realCount = realCount;
    }

    public boolean isContainDuplicateRecord() {
	return isContainDuplicateRecord;
    }

    public void setContainDuplicateRecord(boolean isContainDuplicateRecord) {
	this.isContainDuplicateRecord = isContainDuplicateRecord;
    }

    public boolean isContainNoExistRecord() {
	return isContainNoExistRecord;
    }

    public void setContainNoExistRecord(boolean isContainNoExistRecord) {
	this.isContainNoExistRecord = isContainNoExistRecord;
    }

    public boolean isGetAgentSidFromDB() {
	return isGetAgentSidFromDB;
    }

    public void setGetAgentSidFromDB(boolean isGetAgentSidFromDB) {
	this.isGetAgentSidFromDB = isGetAgentSidFromDB;
    }

    public List<BetRecordModel> getAgentSidList() {
	if (agentSidList == null) {
	    agentSidList = new ArrayList<BetRecordModel>();
	}

	return agentSidList;
    }

    public void addAgentSid(List<BetRecordModel> agentSidList) {
	List<BetRecordModel> list = this.getAgentSidList();
	list.addAll(agentSidList);
    }

    public void addAgentSid(Set<BetRecordModel> agentSidSet) {
	List<BetRecordModel> list = this.getAgentSidList();
	list.addAll(agentSidSet);
    }

    public void addAgentSid(BetRecordModel model) {
	List<BetRecordModel> list = this.getAgentSidList();
	list.add(model);
    }

    public void setAgentSidList(List<BetRecordModel> agentSidList) {
	this.agentSidList = agentSidList;
    }

    public int getWantCount() {
	return wantCount;
    }

    public void setWantCount(int wantCount) {
	this.wantCount = wantCount;
    }

    public String getAgentNo() {
	if (StringUtil.isBlank(agentNo)) {
	    try {
		SentServiceToPassportPrx ice = IceServiceProxy
			.getManagerForPassportService();
		String[] agentNos = ice.getAgentNoList();

		if (agentNos != null && agentNos.length > 0) {
		    agentNo = agentNos[0];
		}
	    } catch (IceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

	if (StringUtil.isBlank(agentNo)) {
	    agentNo = "3711";
	}

	return agentNo;
    }

    public void setAgentNo(String agentNo) {
	this.agentNo = agentNo;
    }

    public GameTypeEnum getGameType() {
	return gameType;
    }

    public void setGameType(GameTypeEnum gameType) {
	this.gameType = gameType;
    }
}
