// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import test.common.constant.ErrorTypeEnum;

import com.uuzz.utils.StringUtil;

/**
 * 类 名: OpenVo<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月4日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class OpenVo {

    // 投注账号
    private String bettingNo;

    // 期望刮开的票数
    private int wantCount = 10;

    // 实际刮开的票数（请求的lotteryCode排重后的数量）
    private int realCount;

    // 请求刮开的lotteryCode列表
    private List<String> lotteryCodeList;

    // 请求刮开的lotteryCode数组
    private String[] lotteryCodes;

    // 是否从数据库获取真实lotteryCode进行测试
    private boolean isGetLotteryCodeFromDB = true;

    // 是否包含不存在的投注记录
    private boolean isContainNoExistRecord = false;

    // 是否包含已经刮开过的数据
    private boolean isContainDuplicateOpen = false;

    // 是否包含其他账户的数据
    private boolean isContainAnotherRecord = false;

    // 是否包含投注失败的数据
    private boolean isContainBetFailRecord = false;

    // 是否包含重复的投注记录号
    private boolean isContainDuplicateRecord = false;

    // 是否要在投注最后，变化投注账号
    private boolean isChangeBettingNo = false;

    // 错误类型枚举
    private ErrorTypeEnum errorType;

    public ErrorTypeEnum getErrorType() {
	return errorType;
    }

    public void setErrorType(ErrorTypeEnum errorType) {
	this.errorType = errorType;
    }

    /**
     * 描 述：获取实际刮开记录数（排重后）<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    public int getRealCount() {
	if (realCount == 0) {
	    List<String> list = this.getLotteryCodeList();
	    Set<String> set = new HashSet<String>(list);
	    realCount = set.size();
	}
	return realCount;
    }

    public void setRealCount(int realCount) {
	this.realCount = realCount;
    }

    public boolean isContainDuplicateOpen() {
	return isContainDuplicateOpen;
    }

    public void setContainDuplicateOpen(boolean isContainDuplicateOpen) {
	this.isContainDuplicateOpen = isContainDuplicateOpen;
    }

    public boolean isContainAnotherRecord() {
	return isContainAnotherRecord;
    }

    public void setContainAnotherRecord(boolean isContainAnotherRecord) {
	this.isContainAnotherRecord = isContainAnotherRecord;
    }

    public boolean isContainBetFailRecord() {
	return isContainBetFailRecord;
    }

    public void setContainBetFailRecord(boolean isContainBetFailRecord) {
	this.isContainBetFailRecord = isContainBetFailRecord;
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

    public boolean isChangeBettingNo() {
	return isChangeBettingNo;
    }

    public void setChangeBettingNo(boolean isChangeBettingNo) {
	this.isChangeBettingNo = isChangeBettingNo;
    }

    public boolean isGetLotteryCodeFromDB() {
	return isGetLotteryCodeFromDB;
    }

    public void setGetLotteryCodeFromDB(boolean isGetLotteryCodeFromDB) {
	this.isGetLotteryCodeFromDB = isGetLotteryCodeFromDB;
    }

    public String[] getLotteryCodes() {
	List<String> list = this.getLotteryCodeList();

	if (!list.isEmpty()) {
	    lotteryCodes = list.toArray(new String[list.size()]);
	}

	return lotteryCodes;
    }

    public void setLotteryCodes(String[] lotteryCodes) {
	this.lotteryCodes = lotteryCodes;
    }

    public OpenVo(String bettingNo) {
	this.bettingNo = bettingNo;
    }

    public String getBettingNo() {
	if (StringUtil.isBlank(bettingNo)) {
	    AccountVo accountVo = AccountVo.getDefaultAccount();
	    bettingNo = accountVo.getBettingNo();
	}

	return bettingNo;
    }

    public void setBettingNo(String bettingNo) {
	this.bettingNo = bettingNo;
    }

    public List<String> getLotteryCodeList() {
	if (lotteryCodeList == null) {
	    lotteryCodeList = new ArrayList<String>();
	}

	return lotteryCodeList;
    }

    public void addLotteryCode(List<String> lotteryCodeList) {
	List<String> list = this.getLotteryCodeList();
	list.addAll(lotteryCodeList);
    }

    public void setLotteryCodeList(List<String> lotteryCodeList) {
	this.lotteryCodeList = lotteryCodeList;
    }

    public int getWantCount() {
	return wantCount;
    }

    public void setWantCount(int wantCount) {
	this.wantCount = wantCount;
    }

}
