// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99106<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99106 extends TestBetBase {

    // 开奖号码设置：直选1+2+3；组三2+3+2
    private static final String GAMECODE = GameEnum.DC_P3.getGameCode();

    /**
     * 描 述：直选单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXDS.getCode());
	betRuleVo.setBetCode("1,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXDS.getCode());
	betRuleVo.setBetCode("2,3,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：直选单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXDS.getCode());
	betRuleVo.setBetCode("6,1,4;5,8,4;0,3,4;9,3,2;1,2,3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXDS.getCode());
	betRuleVo.setBetCode("6,1,4;5,8,4;0,3,4;9,3,2;2,3,2");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选单式失败，单式8注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXDS.getCode());
	betRuleVo.setBetCode("6,1,4;5,8,4;0,3,4;9,3,2;2,3,2;1,2,3;2,3,4;7,4,1");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：直选单式5注失败，投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXFS.getCode());
	betRuleVo.setBetCode("6,1,4;5,8,4;0,3,4;9,3,2;2,3,2");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：直选复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxFs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXFS.getCode());
	betRuleVo.setBetCode("17,28,30");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxFs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXFS.getCode());
	betRuleVo.setBetCode("27,23,42");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：直选组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhFs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHFS.getCode());
	betRuleVo.setBetCode("0,1,2,3,4,5,6,7,8,9");
	betRuleVo.setTimes(720);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhFs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHFS.getCode());
	betRuleVo.setBetCode("0,1,2");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhDt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHDT.getCode());
	betRuleVo.setBetCode("1,2$3,4");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(21);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhDt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHDT.getCode());
	betRuleVo.setBetCode("0,2$3,4,5");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(88);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhDt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHDT.getCode());
	betRuleVo.setBetCode("1,2$0,3,4,5,6,7,8,9");
	betRuleVo.setTimes(48);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhDt4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHDT.getCode());
	betRuleVo.setBetCode("2$0,1,3,4,5,6,7,8,9");
	betRuleVo.setTimes(216);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhDt5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXZHDT.getCode());
	betRuleVo.setBetCode("2$0,1,3");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHz1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27");
	betRuleVo.setTimes(1000);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHz2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("6");
	betRuleVo.setTimes(28);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHz3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("0,27");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHz4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("7");
	betRuleVo.setTimes(36);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHz5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("0,7,6,27");
	betRuleVo.setTimes(66);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选和值 失败，单独投注0<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHzFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：直选和值 失败，单独投注27<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixHzFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHIXHZ.getCode());
	betRuleVo.setBetCode("27");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：直选跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixKd1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXKD.getCode());
	betRuleVo.setBetCode("0,1,2,3,4,5,6,7,8,9");
	betRuleVo.setTimes(1000);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixKd2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXKD.getCode());
	betRuleVo.setBetCode("2");
	betRuleVo.setTimes(96);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixKd3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXKD.getCode());
	betRuleVo.setBetCode("1");
	betRuleVo.setTimes(54);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixKd4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXKD.getCode());
	betRuleVo.setBetCode("0");
	betRuleVo.setTimes(10);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhixKd5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXKD.getCode());
	betRuleVo.setBetCode("0,1,2");
	betRuleVo.setTimes(160);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Ds1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("2,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Ds1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("2,3,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(11);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Ds1z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("3,2,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(22);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Ds1z4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("3,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(22);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Ds5z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("2,2,3;2,3,2;3,2,2;3,3,2;3,2,3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(33);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三单式 失败：三重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("3,3,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三单式 失败：无重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("1,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三单式 失败：6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DS.getCode());
	betRuleVo.setBetCode("2,2,3;9,8,9;7,4,4;0,2,0;9,0,9;5,5,0");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三单式5注 失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DsFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("2,2,3;2,3,2;3,2,2;3,3,2;3,2,3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(33);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Fs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("3,2");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(22);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Fs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("3,2,0");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(33);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Fs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("3,2,0,1,4,5,6,7,8,9");
	betRuleVo.setTimes(90);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Fs4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("2,0,1,4,5,6,7,8,9");
	betRuleVo.setTimes(72);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三复式 失败：只选一个号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3FsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三复式 失败：选了重复的号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3FsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3FS.getCode());
	betRuleVo.setBetCode("2,3,3");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Dt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("2$0,3");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Dt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("2$0,3,1,4,5,6,7,8,9");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(26);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Dt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("9$0,2,1,3,4,5,6,7,8");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三胆拖，失败：胆码超过1个<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DtFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("2,3$0,1,4,5,6,7,8,9");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三胆拖，失败：拖码小于2个<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DtFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("2$3");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三胆拖，失败：胆码拖码重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3DtFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3DT.getCode());
	betRuleVo.setBetCode("2$2,3");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组三跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Kd1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3KD.getCode());
	betRuleVo.setBetCode("1");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Kd2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3KD.getCode());
	betRuleVo.setBetCode("9,8,7,6,5,4,3,2,1");
	betRuleVo.setTimes(90);
	betRuleVo.setMultiple(84);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3Kd3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3KD.getCode());
	betRuleVo.setBetCode("9,8,7,6,5,4,3,2");
	betRuleVo.setTimes(72);
	betRuleVo.setMultiple(94);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组三跨度，失败：选0<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ3KdFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX3KD.getCode());
	betRuleVo.setBetCode("0,8,7,6,5,4,3,2,1");
	betRuleVo.setTimes(90);
	betRuleVo.setMultiple(84);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Ds1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DS.getCode());
	betRuleVo.setBetCode("1,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Ds1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DS.getCode());
	betRuleVo.setBetCode("9,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(80);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Ds5z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DS.getCode());
	betRuleVo.setBetCode("1,2,3;2,3,4;0,1,2;5,8,7;9,0,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(67);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6单式，失败：重复号码<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DS.getCode());
	betRuleVo.setBetCode("2,3,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6单式，失败：7注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DS.getCode());
	betRuleVo.setBetCode("2,3,2;8,6,4;7,3,5;0,4,2;5,8,3;6,9,3;5,7,9");
	betRuleVo.setTimes(7);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6单式，失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,2,3;2,3,4;0,1,2;5,8,7;9,8,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Fs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,2,3,4");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Fs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,6,7,8,9,0");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Fs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,3,4,5,6,7,8,9,0");
	betRuleVo.setTimes(84);
	betRuleVo.setMultiple(58);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6复式，失败：重复号码<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6FsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,3,3,4,5,6,7,8,9,0");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6复式，失败：小于4个号码<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6FsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6FS.getCode());
	betRuleVo.setBetCode("1,2,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Dt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2$0,3,1");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Dt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2$0,3,1,4,5,6,7,8,9");
	betRuleVo.setTimes(36);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组6胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Dt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("1,2$0,3,4,5,6,7,8,9");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Dt4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("3,2$1,9");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Dt5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2,6$0,3,4,5,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6胆拖，失败：胆码重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DtFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2,2$0,3");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6胆拖，失败：胆码大于2个<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DtFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("1,2,3$0,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6胆拖，失败：胆拖码总数小于4<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DtFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("1,2$0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6胆拖，失败：胆拖码重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DtFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2,6$0,3,6");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6胆拖，失败：拖码重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6DtFail5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6DT.getCode());
	betRuleVo.setBetCode("2,6$0,3,3");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Kd1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("2");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Kd2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("9,8,7,6,5,4,3,2");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(27);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6跨度<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6Kd3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("8,7,6,5,4,3");
	betRuleVo.setTimes(104);
	betRuleVo.setMultiple(94);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组6跨度，失败：选0<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6KdFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("0,8,7,6,5,4,3,2");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6跨度，失败：选1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6KdFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("1,8,7,6,5,4,3,2");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组6跨度，失败：选0、1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZ6KdFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZX6KD.getCode());
	betRuleVo.setBetCode("0,1,2");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHz1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("6");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHz2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("7");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHz3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("1,4,10,15,18,21,22,26");
	betRuleVo.setTimes(55);
	betRuleVo.setMultiple(92);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHz4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("26,25,24,23,22,21,20,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19");
	betRuleVo.setTimes(210);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组选和值<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHz5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("1,26");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(50);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：组选和值，失败：单选1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHzFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组选和值，失败：单选26<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHzFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("26");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：组选和值，失败：重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZhuxHzFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZHUXHZ.getCode());
	betRuleVo.setBetCode("1,26,1");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：大额投注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testLarge() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P3_ZXFS.getCode());
	betRuleVo.setBetCode("1234567890,1234567890,1234567890");
	betRuleVo.setTimes(1000);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo);
    }


    /**
     * 描 述：投注失败，投注方式错用七星彩<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("1234567890,1234567890,1234567890");
	betRuleVo.setTimes(1000);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo, false);
    }
}
