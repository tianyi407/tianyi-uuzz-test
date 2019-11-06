// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import test.common.vo.AccountVo;
import test.common.vo.BetRuleVo;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.constant.ResultConstant;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.manager.entity.LicencedGamesResp;
import com.uuzz.lottery.manager.entity.RuleEntity;
import com.uuzz.lottery.manager.service.SentServiceToPassportPrx;
import com.uuzz.lottery.scratch.IceServiceProxy;
import com.uuzz.lottery.scratch.service.ForInceptorServicePrx;
import com.uuzz.lottery.trade.entity.BetJkResp;
import com.uuzz.lottery.trade.entity.BetReq;
import com.uuzz.lottery.trade.entity.BetResult;
import com.uuzz.lottery.trade.entity.BetResultJk;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: BetJk<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class BetJk extends BetBase {

    /**
     * 描 述：请求scratch-ice，即开投注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param in
     * @return
     */
    public BetJkResp bet(BetReq in) {
	BetJkResp out = null;
	try {
	    this.printInParam(in);

	    ForInceptorServicePrx ice = IceServiceProxy
		    .getScratchForInceptorService();
	    out = ice.betJk(in);

	    this.printOutParam(out, out.betRs);

	} catch (IceException e) {
	    e.printStackTrace();
	}

	return out;
    }

    @Override
    protected BetReq buildInParam(BetReq in, AccountVo accountVo,
	    BetRuleVo betRuleVo) {

	in = super.buildInParam(in, accountVo, betRuleVo);

	// 投注总额
	betRuleVo.calculateBetMoney();
	in.betMoney = betRuleVo.getBetMoney();

	return in;
    }

    /**
     * 描 述：请求manager-ice，获取生效的即开玩法列表<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    public List<String> getSellingGameCodeList() {
	List<String> gameCodeList = new ArrayList<String>();
	try {

	    SentServiceToPassportPrx ice = com.uuzz.lottery.manager.IceServiceProxy
		    .getManagerForPassportService();
	    LicencedGamesResp out = ice.getLicencedGames();
	    if (out == null) {
		System.out.println("======查询生效即开玩法结果：ICE响应实体为null======");
		return gameCodeList;
	    }

	    if (out.status != ResultConstant.SUCCESS) {
		System.out.println("======查询生效即开玩法结果：ICE查询失败，resultCode = ["
			+ out.resultCode + "]======");
		return gameCodeList;
	    }

	    RuleEntity[] rules = out.rules;
	    if (rules == null || rules.length == 0) {
		System.out.println("======查询生效即开玩法结果：无======");
		return gameCodeList;
	    }

	    for (RuleEntity rule : rules) {
		int typeNo = Integer.parseInt(rule.type);
		if (GameTypeEnum.JK.getNo() != typeNo) {
		    continue;
		}

		if (rule.status.trim().equals("2")) {
		    gameCodeList.add(rule.logicCode);
		}
	    }

	    System.out.println(String.format("======查询生效即开玩法结果：共%s个玩法======",
		    gameCodeList.size()));
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return gameCodeList;
    }

    @Override
    protected String getPrintMsgRespBetResult(BetResult result) {
	String baseLog = super.getPrintMsgRespBetResult(result);

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "grade=[%s], bingoMoney=[%s], " + StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE + "betCode=[%s].";

	BetResultJk resultJk = (BetResultJk) result;
	String log = String.format(format, resultJk.grade, resultJk.bingoMoney,
		resultJk.betCode);

	return baseLog + log;
    }

}
