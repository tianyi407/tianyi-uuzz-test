// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99202<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99202 extends TestBetBase {

    // 中奖号码：*+*+1+1+1+1+1+1+1+1+1+*
    private static final String GAMECODE = GameEnum.CTZC_BQC6.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo.setBetCode("3#0,1#1,1#1,1#1,1#1,1#0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

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
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo.setBetCode("3#0,1#1,1#3,1#1,1#1,1#0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：单式3注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs3z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo
		.setBetCode("3#0,1#1,1#1,1#1,1#1,1#0;1#0,1#1,1#1,1#1,1#1,1#0;1#3,1#3,1#1,1#1,1#1,1#0");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式3注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs3zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_FS.getCode());
	betRuleVo
		.setBetCode("3#1,1#1,1#1,1#1,1#3,1#0;1#0,1#1,1#1,0#0,1#1,1#0;1#3,1#3,0#1,1#1,1#1,1#0");
	betRuleVo.setTimes(3);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo.setBetCode("3#0,1#1,1#1,1#1,1#1,2#0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单式1注失败，大于6场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo.setBetCode("3#0,1#1,1#1,1#1,1#1,1#0,0#3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单式1注失败，大于6场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo.setBetCode("3#0,1#1,1#1,1#1,1#1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：投注失败，单式6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_DS.getCode());
	betRuleVo
		.setBetCode("3#0,1#1,1#1,1#1,1#1,1#0;1#0,1#1,1#1,1#1,1#1,1#0;1#3,1#3,1#1,1#1,1#1,1#0;3#0,1#1,1#1,3#1,1#1,1#0;3#0,1#1,1#1,1#1,1#3,1#0;3#0,1#1,1#1,1#1,3#3,1#0");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

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
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_FS.getCode());
	betRuleVo.setBetCode("310#0,13#01,31#10,13#01,13#01,13#301");
	betRuleVo.setTimes(4608);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_FS.getCode());
	betRuleVo.setBetCode("310#0,3#01,31#10,13#01,13#01,13#301");
	betRuleVo.setTimes(2304);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：复式失败，大于6场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_FS.getCode());
	betRuleVo.setBetCode("3#0,13#01,31#10,1#1,3#1,1#301,0#1");
	betRuleVo.setTimes(48);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：复式失败，小于6场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_BQC6_FS.getCode());
	betRuleVo.setBetCode("310#0,13#01,31#10,1#1,3#130");
	betRuleVo.setTimes(144);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

}
