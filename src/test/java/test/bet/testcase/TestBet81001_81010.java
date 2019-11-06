// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import test.bet.TestBetBase;
import test.bet.service.BetJk;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet81001_81010<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet81001_81010 extends TestBetBase {

    @Autowired
    private BetJk betJkService;

    private static String GAMECODE = GameEnum.JK_NNYY.getGameCode();
    // 即开投注次数
    private static final int BET_TIMES = 10;

    /**
     * 描 述：投注1次指定玩法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1() {
	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	this.bet(betRuleVo);
    }

    /**
     * 描 述：批量投注指定玩法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test2() {
	for (int i = 0; i < BET_TIMES; i++) {
	    this.test1();
	}
    }

    /**
     * 描 述：批量投注所有生效玩法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3() {
	List<String> gameCodeList = betJkService.getSellingGameCodeList();
	for (String gameCode : gameCodeList) {
	    if (gameCode.equals(GameEnum.JK_XXXY.getGameCode())) {
		continue;
	    }
	    GAMECODE = gameCode;
	    this.test2();
	}
    }

    /**
     * 描 述：投注1次指定玩法失败：没有可售奖组<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail1() {
	BetRuleVo betRuleVo = new BetRuleVo(GameEnum.JK_XXXY.getGameCode());
	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注注数设为2<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail2() {
	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setTimes(2);
	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注倍数设为3<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail3() {
	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setMultiple(3);
	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注金额乱嗨<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail4() {
	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setBetMoney(999999);
	this.bet(betRuleVo, false);
    }

}
