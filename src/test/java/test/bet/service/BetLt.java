// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.service;

import org.springframework.stereotype.Component;

import test.common.constant.SelectTypeEnum;
import test.common.vo.AccountVo;
import test.common.vo.BetRuleVo;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.trade.IceServiceProxy;
import com.uuzz.lottery.trade.entity.BetLtReq;
import com.uuzz.lottery.trade.entity.BetLtResp;
import com.uuzz.lottery.trade.entity.BetReq;
import com.uuzz.lottery.trade.service.ForJoinServicePrx;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: BetLt<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
@Component
public class BetLt extends BetBase {

    /**
     * 描 述：请求trade-ice接口，乐透投注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param in
     * @return
     */
    public BetLtResp bet(BetLtReq in) {
	BetLtResp out = null;
	try {

	    this.printInParam(in);

	    ForJoinServicePrx ice = IceServiceProxy
		    .getTradeForInceptorService();
	    out = ice.betLt(in);

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
    public BetLtReq getInParam(BetRuleVo betRuleVo) {
	BetLtReq in = new BetLtReq();
	return (BetLtReq) this.buildInParam(in, betRuleVo);
    }

    @Override
    protected BetReq buildInParam(BetReq in, AccountVo accountVo, BetRuleVo betRuleVo) {

	in = super.buildInParam(in, accountVo, betRuleVo);

	BetLtReq req = (BetLtReq) in;
	// 奖期期号
	req.period = betRuleVo.getPeriod();
	// 投注所选的号码
	req.betCode = betRuleVo.getBetCode();
	// 是否追加(0 ：不追加，1： 追加)
	req.isAdd = betRuleVo.getIsAdd();
	// 彩种投注方式
	req.betWay = betRuleVo.getDetailType();
	// 选注方式
	req.selecedType = SelectTypeEnum.getRandomSelectType();

	// 投注总额
	betRuleVo.calculateBetMoney();
	req.betMoney = betRuleVo.getBetMoney();

	return req;
    }

    @Override
    protected String getPrintMsgReq(BetReq in) {
	String baseLog = super.getPrintMsgReq(in);

	String format = StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "period=[%s], isAdd=[%s], betWay=[%s], selecedType=[%s], "
		+ StringUtil.NEW_LINE + LOG_BLANK_SPACE + "betCode=[%s].";

	BetLtReq ltIn = (BetLtReq) in;
	String log = String.format(format, ltIn.period, ltIn.isAdd,
		ltIn.betWay, ltIn.selecedType, ltIn.betCode);

	return baseLog + log;
    }

}
