// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99204<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99204 extends TestBetBase {

    // 中奖号码：*+0+0+0+0+0+0+0+0+0+0+0+*+0
    private static final String GAMECODE = GameEnum.CTZC_RX9.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode("3,1,0,3,1,0,3,1,0,,,,,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(99);

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
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode(",1,0,3,1,0,3,1,0,3,,,,");
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
    public void testDs1z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode(",0,0,0,0,0,0,0,0,,,,3,");
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
    public void testDs1z4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode("0,0,0,0,0,0,0,0,,,,,,0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：单式1注失败，大于9场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode("0,0,0,0,0,0,0,0,0,,,,3,1");
	betRuleVo.setTimes(55);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注失败，小于9场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1zFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode(",0,,0,0,0,0,0,0,,,,3,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo
		.setBetCode(",1,0,3,1,0,3,1,0,3,,,,;0,0,0,,0,0,0,0,0,,,,,0;,0,0,0,0,0,0,0,0,,,,3,;,,0,0,0,0,0,0,0,,,0,3,;,0,0,0,0,0,0,0,0,,,,1,");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：单式1注，失败：选项非法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode("0,0,0,0,0,0,0,0,0,,,,,*");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单式6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo
		.setBetCode(",1,0,3,1,0,3,1,0,3,,,,;0,0,0,0,0,0,0,0,0,,,,,0;,0,0,0,0,0,0,0,0,,,,3,;,,0,0,0,0,0,0,0,,,0,3,;,0,0,0,0,0,0,0,0,,,,1,;0,0,3,0,3,0,0,0,0,,,,,0");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo
		.setBetCode(",1,0,0,1,1,3,1,0,3,,,,;0,0,0,,0,0,0,0,0,,,,,0;,0,0,0,0,0,0,0,0,,,,3,;,,0,0,0,0,0,0,0,,,0,3,;,0,0,0,0,0,0,0,0,,,,1,");
	betRuleVo.setTimes(5);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode("310,03,10,30,10,30,10,30,10,,,,,");
	betRuleVo.setTimes(768);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode("310,30,10,30,10,30,10,30,,,,,310,");
	betRuleVo.setTimes(1152);
	betRuleVo.setMultiple(2);

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
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode(",13,10,30,10,30,10,310,,310,,,310,");
	betRuleVo.setTimes(1728);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：复式，测AB转换<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode(",,,,,0,1,3,01,03,13,031,31,30");
	betRuleVo.setTimes(96);
	betRuleVo.setMultiple(100);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：复式，大于9场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode(",30,10,30,10,30,10,310,,310,,,3,310");
	betRuleVo.setTimes(1728);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：复式，小于9场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_FS.getCode());
	betRuleVo.setBetCode(",0,1,3,10,03,13,310,,,,,,310");
	betRuleVo.setTimes(72);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

}
