// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import test.BaseTest;
import test.bet.service.BetJczq;
import test.bet.service.BetJk;
import test.bet.service.BetLt;
import test.common.vo.BetRuleJczqVo;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.ResultConstant;
import com.uuzz.lottery.constant.game.GameEnum;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.trade.entity.BetJkResp;
import com.uuzz.lottery.trade.entity.BetJzReq;
import com.uuzz.lottery.trade.entity.BetJzResp;
import com.uuzz.lottery.trade.entity.BetLtReq;
import com.uuzz.lottery.trade.entity.BetLtResp;
import com.uuzz.lottery.trade.entity.BetReq;

/**
 * 类 名: TestBetBase<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月27日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBetBase extends BaseTest {

    @Autowired
    private BetLt betLtService;
    @Autowired
    private BetJk betJkService;
    @Autowired
    protected BetJczq betJczqService;

    protected void bet(BetRuleVo betRuleVo) {
	this.bet(betRuleVo, true);
    }

    protected void bet(BetRuleJczqVo betRuleVo) {
	this.bet(betRuleVo, true);
    }

    protected void bet(BetRuleVo betRuleVo, boolean isCheckSuccess) {
	String gameCode = betRuleVo.getGameCode();
	GameEnum gameEnum = GameEnum.findByGameCode(gameCode);
	if (gameEnum == null) {
	    System.out.println("^^^^^^^^^^^^未找到对应游戏。");
	    return;
	}

	GameTypeEnum gameType = gameEnum.getGameType();
	if (GameTypeEnum.DC.equals(gameType)
		|| GameTypeEnum.CTZC.equals(gameType)) {
	    BetLtReq in = betLtService.getInParam(betRuleVo);
	    BetLtResp out = betLtService.bet(in);
	    this.checkResult(out.status, out.betRs.betState, isCheckSuccess);
	} else if (GameTypeEnum.JK.equals(gameType)) {
	    BetReq in = betJkService.getInParam(betRuleVo);
	    BetJkResp out = betJkService.bet(in);
	    this.checkResult(out.status, out.betRs.betState, isCheckSuccess);
	}
    }

    protected void bet(BetRuleJczqVo betRuleVo, boolean isCheckSuccess) {
	BetJzReq in = betJczqService.getInParam(betRuleVo);
	BetJzResp out = betJczqService.bet(in, betRuleVo);
	this.checkResult(out.status, out.betRs.betState, isCheckSuccess);
    }

    private void checkResult(int status, int betState, boolean isCheckSuccess) {
	if (isCheckSuccess) {
	    Assert.assertEquals(ResultConstant.SUCCESS, status);
	    Assert.assertEquals(2, betState);
	} else {
	    Assert.assertEquals(ResultConstant.FAILURE, status);
	    Assert.assertEquals(3, betState);
	}
    }

}
