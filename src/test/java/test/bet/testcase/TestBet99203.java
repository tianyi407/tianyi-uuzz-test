// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99203<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99203 extends TestBetBase {

    // 中奖号码：3＋+*+3＋+3＋+3＋+3＋+3＋+*
    private static final String GAMECODE = GameEnum.CTZC_JQ4.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("3#0,3#3,3#3,3#2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("3#3,3#3,3#3,3#3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#3,1#3,3#3,0#3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#0,1#3,3#3,0#3;1#0,1#3,1#3,0#3;2#0,1#3,3#3,0#1;2#0,1#3,2#3,0#3;2#0,2#3,3#3,0#3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(12);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#0,1#3,3#3,0#3;3#0,3#3,3#3,3#2;2#0,1#3,3#3,0#1;3#0,3#3,3#3,3#1;3#2,3#3,3#3,3#0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("2#0,1#3,1#1,0#3;3#0,3#3,3#3,3#2;2#0,1#3,0#3,0#1;3#0,3#3,3#3,3#1;3#2,3#3,3#3,3#0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注，失败：选项非法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#3,1#3,3#3,0#3+");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注，失败：选项非法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#3,1#3,3#3+,0#3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注失败，单式6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#0,1#3,3#3,0#3;3#0,3#3,3#3,3#2;2#0,1#3,3#3,0#1;3#0,3#3,3#3,3#1;3#2,3#3,3#3,3#0;0#2,3#3,2#3,3#0");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注失败，大于4场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#3,1#3,3#3,0#3,1#2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注失败，小于4场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("2#3,1#3,3#3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("30#1230,13#23,13#01,23#0132");
	betRuleVo.setTimes(1024);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("312#1230,13#23,13#01,23#0132");
	betRuleVo.setTimes(1536);
	betRuleVo.setMultiple(5);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("3120#1,13#23,13#01,23#0132");
	betRuleVo.setTimes(512);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：投注失败，单式投注复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_DS.getCode());
	betRuleVo.setBetCode("30#1230,13#23,13#01,23#0132");
	betRuleVo.setTimes(1024);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：复式失败，大于4场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("3120#1,13#23,13#01,23#0132,13#02");
	betRuleVo.setTimes(2048);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：复式失败，小于4场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_JQ4_FS.getCode());
	betRuleVo.setBetCode("3120#1,13#23,13#01");
	betRuleVo.setTimes(64);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
}
