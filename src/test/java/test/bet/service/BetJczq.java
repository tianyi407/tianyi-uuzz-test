// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.service;

import org.springframework.stereotype.Component;

import test.common.vo.AccountVo;
import test.common.vo.BetRuleJczqVo;
import test.common.vo.BetRuleVo;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.manager.entity.JcPool;
import com.uuzz.lottery.sport.IceServiceProxy;
import com.uuzz.lottery.sport.service.ForJoinServicePrx;
import com.uuzz.lottery.trade.entity.BetJzReq;
import com.uuzz.lottery.trade.entity.BetJzResp;
import com.uuzz.lottery.trade.entity.BetReq;
import com.uuzz.lottery.trade.entity.BetResult;
import com.uuzz.lottery.trade.entity.BetResultJz;
import com.uuzz.lottery.trade.entity.JzBetCode;
import com.uuzz.lottery.trade.entity.JzBetCodeReq;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: BetJczq<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class BetJczq extends BetBase {

    /**
     * 描 述：请求sport-ice接口投注竞彩<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param in
     * @param betRuleVo
     * @return
     */
    public BetJzResp bet(BetJzReq in, BetRuleJczqVo betRuleVo) {
	BetJzResp out = null;
	try {
	    this.printInParam(in, betRuleVo);

	    ForJoinServicePrx ice = IceServiceProxy
		    .getSportForInceptorService();
	    out = ice.betJz(in);

	    this.printOutParam(out, out.betRs);

	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    /**
     * 描 述：从VO转换成ice接口实体<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param betRuleVo
     * @return
     */
    public BetJzReq getInParam(BetRuleJczqVo betRuleVo) {
	BetJzReq in = new BetJzReq();
	return (BetJzReq) this.buildInParam(in, betRuleVo);
    }

    @Override
    protected BetReq buildInParam(BetReq in, AccountVo accountVo,
	    BetRuleVo betRuleVo) {

	in = super.buildInParam(in, accountVo, betRuleVo);

	BetJzReq req = (BetJzReq) in;
	BetRuleJczqVo betRuleJzVo = (BetRuleJczqVo) betRuleVo;

	// 彩种投注方式
	req.betWay = betRuleVo.getDetailType();
	// 投注内容
	req.jzBetCodeReqs = betRuleJzVo.getBetSelectArray();

	// 投注数量（注数）
	betRuleJzVo.calculateTimes();
	in.times = betRuleVo.getTimes();

	// 投注总额
	betRuleVo.calculateBetMoney();
	req.betMoney = betRuleVo.getBetMoney();

	return req;
    }

    private void printInParam(BetJzReq in, BetRuleJczqVo betRuleVo) {
	String baseLog = super.getPrintMsgReq(in);

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE + "betWay=[%s].";

	String log = String.format(format, in.betWay);

	System.out.println(baseLog + log);

	for (JzBetCodeReq betCode : in.jzBetCodeReqs) {
	    String logicCode = betCode.poolGameCode;
	    long matchId = betCode.matchId;
	    JcPool pool = betRuleVo.getJcPoolMap().get(matchId).get(logicCode);

	    String betCodeFormat = "-----------投注请求详情：logicCode=[%s], matchId=[%s], poolId=[%s], content=[%s].";
	    System.out.println(String.format(betCodeFormat, logicCode, matchId,
		    pool.poolId, betCode.sel));
	}
    }

    @Override
    protected String getPrintMsgRespBetResult(BetResult result) {
	String baseLog = super.getPrintMsgRespBetResult(result);

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "expectMaxPrize=[%s].";

	BetResultJz resultJz = (BetResultJz) result;
	String log = String.format(format, resultJz.expectMaxPrize);

	StringBuffer betCodeBuffer = new StringBuffer();
	for (JzBetCode pick : resultJz.jzBetCodes) {
	    String betCodeFormat = StringUtil.NEW_LINE
		    + "-----------投注结果详情matchId=[%s], poolGameCode=[%s], content=[%s].";
	    String betCodeLog = String.format(betCodeFormat, pick.matchId,
		    pick.poolGameCode, pick.content);
	    betCodeBuffer.append(betCodeLog);
	}

	return baseLog + log + betCodeBuffer.toString();
    }

}
