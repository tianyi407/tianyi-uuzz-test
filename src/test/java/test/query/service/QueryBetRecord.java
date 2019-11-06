// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import test.common.db.model.BetRecordModel;
import test.common.vo.QueryBetRecordVo;
import test.dao.impl.TradeJikaiRecordDao;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.entity.ResultEntity;
import com.uuzz.lottery.scratch.service.ForInceptorServicePrx;
import com.uuzz.lottery.trade.entity.BetRecordBase;
import com.uuzz.lottery.trade.entity.BetRecordPeriodSport;
import com.uuzz.lottery.trade.entity.JzBetCode;
import com.uuzz.lottery.trade.entity.QueryBetRecordCzResp;
import com.uuzz.lottery.trade.entity.QueryBetRecordCzResult;
import com.uuzz.lottery.trade.entity.QueryBetRecordJkResp;
import com.uuzz.lottery.trade.entity.QueryBetRecordJkResult;
import com.uuzz.lottery.trade.entity.QueryBetRecordJzResp;
import com.uuzz.lottery.trade.entity.QueryBetRecordJzResult;
import com.uuzz.lottery.trade.entity.QueryBetRecordLtResp;
import com.uuzz.lottery.trade.entity.QueryBetRecordLtResult;
import com.uuzz.lottery.trade.entity.QueryBetRecordReq;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: QueryBetRecord<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class QueryBetRecord {

    @Autowired
    private TradeJikaiRecordDao tradeJikaiRecordDao;

    private static final String LOG_BLANK_SPACE = "                           ";

    public QueryBetRecordJkResp queryBetRecordJk(QueryBetRecordReq[] reqs) {
	QueryBetRecordJkResp out = null;
	try {
	    ForInceptorServicePrx ice = com.uuzz.lottery.scratch.IceServiceProxy
		    .getScratchForInceptorService();

	    this.printInParam(reqs, GameTypeEnum.JK);

	    out = ice.queryBetRecordJk(reqs);

	    this.printOutParam(out);
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    public QueryBetRecordLtResp queryBetRecordLt(QueryBetRecordReq[] reqs) {
	QueryBetRecordLtResp out = null;
	try {
	    com.uuzz.lottery.trade.service.ForJoinServicePrx ice = com.uuzz.lottery.trade.IceServiceProxy
		    .getTradeForInceptorService();

	    this.printInParam(reqs, GameTypeEnum.DC);

	    out = ice.queryBetRecordLt(reqs);

	    this.printOutParam(out);
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    public QueryBetRecordCzResp queryBetRecordCtzc(QueryBetRecordReq[] reqs) {
	QueryBetRecordCzResp out = null;
	try {
	    com.uuzz.lottery.trade.service.ForJoinServicePrx ice = com.uuzz.lottery.trade.IceServiceProxy
		    .getTradeForInceptorService();

	    this.printInParam(reqs, GameTypeEnum.CTZC);

	    out = ice.queryBetRecordCz(reqs);

	    this.printOutParam(out);
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    public QueryBetRecordJzResp queryBetRecordJczq(QueryBetRecordReq[] reqs) {
	QueryBetRecordJzResp out = null;
	try {
	    com.uuzz.lottery.sport.service.ForJoinServicePrx ice = com.uuzz.lottery.sport.IceServiceProxy
		    .getSportForInceptorService();

	    this.printInParam(reqs, GameTypeEnum.JCZQ);

	    out = ice.queryBetRecordJz(reqs);

	    this.printOutParam(out);
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    public QueryBetRecordReq[] getInParam(QueryBetRecordVo queryBetRecordVo) {
	List<BetRecordModel> modelList = queryBetRecordVo
		.fillQueryBetRecordModel();
	QueryBetRecordReq[] reqs = new QueryBetRecordReq[modelList.size()];
	for (int i = 0; i < modelList.size(); i++) {
	    BetRecordModel model = modelList.get(i);
	    QueryBetRecordReq req = new QueryBetRecordReq();
	    req.agentNo = model.getAgentNo();
	    req.agentSerial = model.getAgentSerial();
	    reqs[i] = req;
	}

	return reqs;
    }

    private void printInParam(QueryBetRecordReq[] reqs, GameTypeEnum gameType) {

	StringBuffer msg = new StringBuffer(StringUtil.NEW_LINE);
	msg.append("======查询投注记录（" + gameType.getNameZh() + "），请求条数 = ["
		+ reqs.length + "], 请求详情如下：");
	for (QueryBetRecordReq req : reqs) {
	    msg.append(StringUtil.NEW_LINE);
	    msg.append("-----------请求详情：agentNo=[" + req.agentNo
		    + "], agentSid=[" + req.agentSerial + "].");
	}

	System.out.println(msg.toString());
    }

    private void printOutParam(QueryBetRecordJkResp out) {

	QueryBetRecordJkResult[] results = out.results;
	int resultsLength = 0;
	if (results != null) {
	    resultsLength = results.length;
	}

	this.printLogOfResultEntity(GameTypeEnum.JK, out, resultsLength);

	if (resultsLength == 0) {
	    return;
	}

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "exsits = [%s], grade = [%s].";

	for (QueryBetRecordJkResult result : results) {
	    String baseLog = this.getPrintLogOfBetRecordBase(result);
	    String log = String.format(format, result.exsits, result.grade);
	    System.out.println(baseLog + log);
	}

    }

    private void printOutParam(QueryBetRecordLtResp out) {
	QueryBetRecordLtResult[] results = out.results;
	int resultsLength = 0;
	if (results != null) {
	    resultsLength = results.length;
	}

	this.printLogOfResultEntity(GameTypeEnum.DC, out, resultsLength);

	if (resultsLength == 0) {
	    return;
	}

	String format = StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "exsits = [%s], isAdd = [%s], openCode = [%s], poolOpenCode = [%s].";

	for (QueryBetRecordLtResult result : results) {
	    String baseLog = this.getPrintLogOfBetRecordPeriodSport(result);
	    String log = String.format(format, result.exsits, result.isAdd,
		    result.openCode, result.poolOpenCode);
	    System.out.println(baseLog + log);
	}
    }

    private void printOutParam(QueryBetRecordCzResp out) {
	QueryBetRecordCzResult[] results = out.results;
	int resultsLength = 0;
	if (results != null) {
	    resultsLength = results.length;
	}

	this.printLogOfResultEntity(GameTypeEnum.CTZC, out, resultsLength);

	if (resultsLength == 0) {
	    return;
	}

	String format = StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "exsits = [%s], isAdd = [%s], openCode = [%s], poolOpenCode = [%s].";

	for (QueryBetRecordCzResult result : results) {
	    String baseLog = this.getPrintLogOfBetRecordPeriodSport(result);
	    String log = String.format(format, result.exsits, result.isAdd,
		    result.openCode, result.poolOpenCode);
	    System.out.println(baseLog + log);
	}
    }

    private void printOutParam(QueryBetRecordJzResp out) {
	QueryBetRecordJzResult[] results = out.results;
	int resultsLength = 0;
	if (results != null) {
	    resultsLength = results.length;
	}

	this.printLogOfResultEntity(GameTypeEnum.JCZQ, out, resultsLength);

	if (resultsLength == 0) {
	    return;
	}

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "exsits = [%s], expectBonuses = [%s], processState = [%s].";

	for (QueryBetRecordJzResult result : results) {
	    String baseLog = this.getPrintLogOfBetRecordPeriodSport(result);
	    String log = String.format(format, result.exsits,
		    result.expectBonuses, result.processState);

	    StringBuffer logBuffer = new StringBuffer();
	    logBuffer.append(baseLog);
	    logBuffer.append(log);

	    JzBetCode[] betCodeArr = result.jzBetCodes;
	    if (betCodeArr != null && betCodeArr.length > 0) {
		for (JzBetCode betCode : betCodeArr) {
		    String logModel = StringUtil.NEW_LINE
			    + "-----------投注内容：matchId = [%s], poolGameCode = [%s], content = [%s].";
		    logBuffer.append(String.format(logModel, betCode.matchId,
			    betCode.poolGameCode, betCode.content));
		}
	    }

	    System.out.println(logBuffer.toString() + StringUtil.NEW_LINE);
	}
    }

    private void printLogOfResultEntity(GameTypeEnum gameType,
	    ResultEntity result, int resultsLength) {
	String format = StringUtil.NEW_LINE
		+ "======查询投注记录（%s），响应：status = [%s]，resultCode = [%s], msg = [%s], 查询结果条数 = [%s].";
	System.out.println(String.format(format, gameType.getNameZh(),
		result.status, result.resultCode, result.msg, resultsLength));
    }

    private String getPrintLogOfBetRecordBase(BetRecordBase base) {
	String format = "-----------结果详情：agentNo = [%s], agentSerial = [%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "betState = [%s], bgwCode = [%s], bgwMsg = [%s], bettingNo = [%s], accNo = [%s], areaCode = [%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "gameCode = [%s], ruleId = [%s], times = [%s], multy = [%s], betMoney = [%s], paymentId = [%s], repayState = [%s], "
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "betCode = [%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "lotteryCode = [%s], elecCode = [%s], centerCode = [%s], security = [%s], betRecordId = [%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "sendState = [%s], bingoTimes = [%s], bingoMoney = [%s], afterBingoMoney = [%s], isGreat = [%s], sendPaymentId = [%s], mostSingle = [%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "betTime = [%s], centerBetTime = [%s], sellTime = [%s], openTime = [%s], sendTime = [%s], discardTime = [%s], cpYearTime = [%s],";

	return String.format(format, base.agentNo, base.agentSerial,
		base.betState, base.bgwCode, base.bgwMsg, base.bettingNo,
		base.accNo, base.areaCode, base.gameCode, base.ruleId,
		base.times, base.multy, base.betMoney, base.paymentId,
		base.repayState, base.betCode, base.lotteryCode, base.elecCode,
		base.centerCode, base.security, base.betRecordId,
		base.sendState, base.bingoTimes, base.bingoMoney,
		base.afterBingoMoney, base.isGreat, base.sendPaymentId,
		base.mostSingle, base.betTime, base.centerBetTime,
		base.sellTime, base.openTime, base.sendTime, base.discardTime,
		base.cpYearTime);
    }

    private String getPrintLogOfBetRecordPeriodSport(BetRecordPeriodSport record) {

	String baseLog = this.getPrintLogOfBetRecordBase(record);

	String format = StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "period = [%s], betWay = [%s], ifLarge = [%s], mobile = [%s], businessDate = [%s],"
		+ StringUtil.NEW_LINE + LOG_BLANK_SPACE + "detail = [%s],";

	String log = String.format(format, record.period, record.betWay,
		record.ifLarge, record.mobile, record.businessDate,
		record.detail);

	return baseLog + log;
    }
}
