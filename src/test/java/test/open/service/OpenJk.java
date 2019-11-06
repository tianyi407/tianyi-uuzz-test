// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.open.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import test.common.constant.ErrorTypeEnum;
import test.common.constant.OpenStateJkEnum;
import test.common.vo.OpenVo;
import test.dao.impl.TradeJikaiRecordDao;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.scratch.IceServiceProxy;
import com.uuzz.lottery.scratch.service.ForInceptorServicePrx;
import com.uuzz.lottery.trade.entity.OpenUpBatchResp;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: OpenJk<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class OpenJk {

    @Autowired
    private TradeJikaiRecordDao tradeJikaiRecordDao;

    public OpenUpBatchResp open(OpenVo openVo) {
	OpenUpBatchResp out = null;
	try {
	    String bettingNo = openVo.getBettingNo();
	    String[] lotteryCodes = openVo.getLotteryCodes();

	    ErrorTypeEnum error = openVo.getErrorType();
	    if (error != null) {
		if (ErrorTypeEnum.JK_OPEN_IN_1.equals(error)) {
		    bettingNo = null;
		}
		if (ErrorTypeEnum.JK_OPEN_IN_2.equals(error)) {
		    bettingNo = StringUtil.EMPTY_STRING;
		}
		if (ErrorTypeEnum.JK_OPEN_IN_3.equals(error)) {
		    lotteryCodes = null;
		}
		if (ErrorTypeEnum.JK_OPEN_IN_4.equals(error)) {
		    lotteryCodes = new String[] {};
		}
	    }

	    this.printInParam(bettingNo, lotteryCodes);

	    ForInceptorServicePrx ice = IceServiceProxy
		    .getScratchForInceptorService();
	    out = ice.openUpBatch(bettingNo, lotteryCodes);

	    System.out
		    .println(String
			    .format(StringUtil.NEW_LINE
				    + "======刮开总结果：status = [%s], resultCode = [%s], msg = [%s]======",
				    out.status, out.resultCode, out.msg));
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    public OpenVo getInParam(OpenVo openVo) {
	this.fillLotteryCode(openVo);
	this.buildErrorData(openVo);

	return openVo;
    }

    private void buildErrorData(OpenVo openVo) {
	if (openVo.isChangeBettingNo()) {
	    openVo.setBettingNo(openVo.getBettingNo() + "9");
	}
    }

    private void fillLotteryCode(OpenVo openVo) {
	int wantCount = openVo.getWantCount();

	if (openVo.isGetLotteryCodeFromDB()) {
	    int errorCount = this.getErrorGroupCount(openVo);
	    if (errorCount > wantCount) {
		openVo.setWantCount(errorCount * 2);
		wantCount = openVo.getWantCount();
	    }

	    int average = wantCount / errorCount;
	    if (openVo.isContainAnotherRecord()) {
		this.fillLotteryCode4AnotherRecord(openVo, average);
		wantCount -= average;
	    }

	    if (openVo.isContainBetFailRecord()) {
		this.fillLotteryCode4BetFailRecord(openVo, average);
		wantCount -= average;
	    }

	    if (openVo.isContainDuplicateOpen()) {
		this.fillLotteryCode4DuplicateOpen(openVo, average);
		wantCount -= average;
	    }

	    if (openVo.isContainDuplicateRecord()) {
		this.fillLotteryCode4NeedOpen(openVo, average);
		wantCount -= average;
	    }

	    this.fillLotteryCode4NeedOpen(openVo, average);
	    wantCount -= average;
	}

	this.fillLotteryCode4NoExistRecord(openVo, wantCount);
    }

    private void fillLotteryCode4DuplicateOpen(OpenVo openVo, int count) {
	List<String> lotteryCodeList = tradeJikaiRecordDao
		.queryNeedOpenLotteryCode(openVo.getBettingNo(), count,
			OpenStateJkEnum.YES.getValue());
	openVo.addLotteryCode(lotteryCodeList);
    }

    private void fillLotteryCode4AnotherRecord(OpenVo openVo, int count) {
	List<String> lotteryCodeList = tradeJikaiRecordDao
		.queryAnotherLotteryCode(openVo.getBettingNo(), count);
	openVo.addLotteryCode(lotteryCodeList);
    }

    private void fillLotteryCode4BetFailRecord(OpenVo openVo, int count) {
	List<String> lotteryCodeList = tradeJikaiRecordDao
		.queryBetFailLotteryCode(openVo.getBettingNo(), count);
	openVo.addLotteryCode(lotteryCodeList);
    }

    private void fillLotteryCode4NoExistRecord(OpenVo openVo, int count) {
	List<String> lotteryCodeList = new ArrayList<String>();
	for (int i = 0; i < count; i++) {
	    lotteryCodeList.add(UUID.randomUUID().toString().substring(0, 17));
	}
	openVo.addLotteryCode(lotteryCodeList);
    }

    private void fillLotteryCode4NeedOpen(OpenVo openVo, int count) {
	List<String> lotteryCodeList = tradeJikaiRecordDao
		.queryNeedOpenLotteryCode(openVo.getBettingNo(), count,
			OpenStateJkEnum.NO.getValue());
	openVo.addLotteryCode(lotteryCodeList);
    }

    private int getErrorGroupCount(OpenVo openVo) {
	int errorCount = 1;
	if (openVo.isContainAnotherRecord()) {
	    errorCount++;
	}

	if (openVo.isContainBetFailRecord()) {
	    errorCount++;
	}

	if (openVo.isContainDuplicateOpen()) {
	    errorCount++;
	}

	if (openVo.isContainDuplicateRecord()) {
	    errorCount++;
	}

	if (openVo.isContainNoExistRecord()) {
	    errorCount++;
	}

	return errorCount;
    }

    private void printInParam(String bettingNo, String[] lotteryCodes) {

	StringBuffer msg = new StringBuffer(StringUtil.NEW_LINE);
	msg.append("======刮开请求：bettingNo=[" + bettingNo + "], ");
	msg.append(StringUtil.NEW_LINE);
	msg.append("                             lotteryCodes=[");

	if (lotteryCodes == null) {
	    msg.append("null");
	} else if (lotteryCodes.length == 0) {
	    msg.append(StringUtil.BLANK_SPACE);
	} else {

	    int count = 0;
	    for (String lotteryCode : lotteryCodes) {
		if (count != 0) {
		    msg.append(", ");
		}
		
		if (count == 5) {
		    count = 0;
		    msg.append(StringUtil.NEW_LINE);
		    msg.append("                             ");
		}
		
		msg.append(lotteryCode);
		count++;
	    }
	}

	msg.append("].");

	System.out.println(msg.toString());
    }

}
