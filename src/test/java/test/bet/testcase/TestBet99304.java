// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99304<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99304 extends TestBetBase {

    // 中奖号码：1+2+3+4+5；重号：5+5+5+5+5；三重：4+5+5+5+5；二双重：4+4+5+5+5；一重：3+4+5+5+6
    private static final String GAMECODE = GameEnum.DC_HN41.getGameCode();

    /**
     * 描 述：4+1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS411z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo.setBetCode("1,2,3,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS411z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo.setBetCode("5,5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS415z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo
		.setBetCode("1,2,3,4,5;0,1,2,3,4;1,2,3,4,6;2,3,4,5,6;0,9,0,1,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS415z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo
		.setBetCode("1,2,9,4,9;0,1,2,0,4;5,5,5,5,5;2,3,4,5,6;0,9,0,1,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1单式1注，失败：复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS41Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo.setBetCode("1,2,3,4,11");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4+1单式6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS41Fail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_41.getCode());
	betRuleVo
		.setBetCode("1,2,9,4,9;0,1,2,0,4;5,5,5,5,5;2,3,4,5,6;0,9,0,1,9;1,2,3,4,11");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：4+1单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDS415zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo
		.setBetCode("1,2,8,4,9;0,1,2,7,4;5,5,5,5,5;2,3,4,5,6;0,9,0,1,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位4单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD41z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D4.getCode());
	betRuleVo.setBetCode("1,2,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD41z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D4.getCode());
	betRuleVo.setBetCode("5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD45z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D4.getCode());
	betRuleVo.setBetCode("1,2,3,4;0,0,0,0;1,2,3,5;9,8,7,6;1,3,3,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD45z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D4.getCode());
	betRuleVo.setBetCode("9,2,3,9;0,0,0,0;5,5,5,5;9,8,7,6;1,3,3,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4单式1注，失败：选特殊位<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD4Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D4.getCode());
	betRuleVo.setBetCode("1,0,3,,0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：定位4单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD45zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D4.getCode());
	betRuleVo.setBetCode("9,2,5,9;0,0,0,0;5,5,5,5;9,2,7,6;1,3,3,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位3单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD31z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode("1,2,3,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD31z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode(",2,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD31z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode("1,,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD35z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode("1,2,3,;,2,3,4;1,,3,4;2,3,0,;1,2,,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD35z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode("5,5,5,;,2,9,4;1,,3,0;2,7,0,;1,2,,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3单式1注，失败：选特殊位<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD3Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D3.getCode());
	betRuleVo.setBetCode("1,,3,,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：定位3单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD3Fail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D3.getCode());
	betRuleVo.setBetCode("5,5,5,;,2,9,4;1,,3,0;2,7,0,;1,2,,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD21z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("1,2,,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD21z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode(",2,3,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(12);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD21z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode(",,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(23);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD21z4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("1,,,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(34);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD21z5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("5,,5,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(51);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式1注，失败：选特殊位<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD2Fail() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("5,,,,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位2单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD25z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("1,2,,;,2,3,;1,,,4;,,3,0;,2,,7");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD25z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D2.getCode());
	betRuleVo.setBetCode("1,5,,;,2,5,;1,,,5;,,5,5;,5,,5");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：定位2单式5注：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD25zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D2.getCode());
	betRuleVo.setBetCode("1,5,,;,2,5,;1,,,5;,,5,5;,5,,5");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD11z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode("1,,,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD11z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",2,,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD11z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,3,");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD11z4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD11z5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式1注，失败：选特殊位<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD1Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,,,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位1单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD15z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,,4;1,,,;,2,,;,,3,;,0,,");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD15z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXDS_D1.getCode());
	betRuleVo.setBetCode(",,,5;5,,,;,5,,;,,5,;,5,,");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：定位1单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXDSD15zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D1.getCode());
	betRuleVo.setBetCode(",,,4;1,,,;,2,,;,,3,;,0,,");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4+1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFS411() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo.setBetCode("1,2,3,4,45");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFS412() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo.setBetCode("15,25,35,54,45");
	betRuleVo.setTimes(32);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFS413() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo.setBetCode("1234567890,56789,12340,13579,02468");
	betRuleVo.setTimes(6250);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4+1复式，失败：重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFS41Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo.setBetCode("55,25,35,54,45");
	betRuleVo.setTimes(32);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位4复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD41() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D4.getCode());
	betRuleVo.setBetCode("1,2,3,45");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD42() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D4.getCode());
	betRuleVo.setBetCode("51,52,53,45");
	betRuleVo.setTimes(16);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD43() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D4.getCode());
	betRuleVo.setBetCode("0123456789,56789,12340,13579");
	betRuleVo.setTimes(1250);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位4复式，失败：选特殊位<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD4Fail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D4.getCode());
	betRuleVo.setBetCode("1,2,3,,45");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：定位3复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD31() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D3.getCode());
	betRuleVo.setBetCode("1,2,35,");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD32() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D3.getCode());
	betRuleVo.setBetCode("15,52,,35");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位3复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD33() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D3.getCode());
	betRuleVo.setBetCode(",52,35,054");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD21() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D2.getCode());
	betRuleVo.setBetCode("1,23,,");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD22() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D2.getCode());
	betRuleVo.setBetCode("125,,3095,");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(50);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位2复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD23() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D2.getCode());
	betRuleVo.setBetCode("125,,,3095");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(50);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD11() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D1.getCode());
	betRuleVo.setBetCode("15,,,");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD12() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D1.getCode());
	betRuleVo.setBetCode(",1234567890,,");
	betRuleVo.setTimes(10);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：定位1复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZXFSD13() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_D1.getCode());
	betRuleVo.setBetCode(",,12467890,");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234,");
	betRuleVo.setTimes(24);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234567890,");
	betRuleVo.setTimes(5040);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234,5");
	betRuleVo.setTimes(24);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234,54");
	betRuleVo.setTimes(48);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234,0987654321");
	betRuleVo.setTimes(240);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFS6() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1235670,0987654321");
	betRuleVo.setTimes(8400);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：组合复式，失败：重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZHFSFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZHFS.getCode());
	betRuleVo.setBetCode("1234,55");
	betRuleVo.setTimes(24);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：胆拖复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode("1,2,,$3,4$5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode("1,2,,$3,4,1,2$5");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode("1,2,,$0,1,2,3,4,5,6,7,8,9$0,9,8,7,6,5,4,3,2,1");
	betRuleVo.setTimes(900);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFs4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode(",5,,$0,1,2,3,4,5,6,7,8,9$0,9,8,7,6,5,4,3,2,1");
	betRuleVo.setTimes(7200);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFs5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode(",5,,$1,2,3$");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖复式，失败：胆码超2个<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode("1,2,3,$3,4$5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：胆拖复式，失败：胆码超2个，且胆拖总数为4个<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDtFsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_DTFS_41.getCode());
	betRuleVo.setBetCode("1,2,,3$4$5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Ds1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS.getCode());
	betRuleVo.setBetCode("4,3,1,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Ds1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS.getCode());
	betRuleVo.setBetCode("0,1,5,8");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4单式1注，失败，重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Ds1zFail() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS.getCode());
	betRuleVo.setBetCode("0,1,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Ds5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS.getCode());
	betRuleVo.setBetCode("4,3,1,2;1,2,3,4;5,6,7,8;0,1,2,3;1,2,3,5");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：任选4单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Ds5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2;1,2,3,4;5,6,7,9;0,1,2,3;1,6,3,5");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Fs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2,5");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Fs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2,5,0,6,7,8,9");
	betRuleVo.setTimes(210);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4复式，失败：重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4FsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4$3,1,2,5");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3$1,2,5");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3,1$2,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3,1$2,5,0,6,7,8,9");
	betRuleVo.setTimes(7);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,1$2,5,3,0,6,7,8,9");
	betRuleVo.setTimes(28);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4Dt6() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("5,1$2,4,3,0,6,7,8,9");
	betRuleVo.setTimes(28);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选4胆拖，失败：胆超过3<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4DtFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3,1,2$5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4DtFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3,1$5,1");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选4胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR4DtFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DT.getCode());
	betRuleVo.setBetCode("4,3,1$5,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS.getCode());
	betRuleVo.setBetCode("4,3,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS.getCode());
	betRuleVo.setBetCode("5,3,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3单式1注，失败：重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds1zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS.getCode());
	betRuleVo.setBetCode("1,3,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS.getCode());
	betRuleVo.setBetCode("4,3,1;1,2,3;2,4,3;5,1,0;9,8,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS.getCode());
	betRuleVo.setBetCode("4,5,1;5,2,3;2,5,3;5,9,0;9,8,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：任选3单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Ds5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_FS.getCode());
	betRuleVo.setBetCode("4,5,1;5,2,3;2,5,3;5,9,0;9,8,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Fs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_FS.getCode());
	betRuleVo.setBetCode("4,3,1,5");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Fs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2,5,0,6,7,8,9");
	betRuleVo.setTimes(120);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3复式，失败：重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3FsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_FS.getCode());
	betRuleVo.setBetCode("4,3,1,4");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Dt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4$3,1,5");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Dt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4,3$2,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Dt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4,1$2,5,3,0,6,7,8,9");
	betRuleVo.setTimes(8);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Dt5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("1$2,4,5,3,0,6,7,8,9");
	betRuleVo.setTimes(36);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3Dt6() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("5$1,2,4,3,0,6,7,8,9");
	betRuleVo.setTimes(36);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选3胆拖，失败：胆超过2<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3DtFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4,3,1$5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3DtFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4,3$5,3");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选3胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR3DtFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DT.getCode());
	betRuleVo.setBetCode("4,3$5,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS.getCode());
	betRuleVo.setBetCode("4,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS.getCode());
	betRuleVo.setBetCode("5,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2单式1注，失败：重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds1zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS.getCode());
	betRuleVo.setBetCode("1,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS.getCode());
	betRuleVo.setBetCode("4,3;2,3;2,4;5,1;9,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS.getCode());
	betRuleVo.setBetCode("4,5;5,3;2,5;9,0;9,8");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：任选2单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Ds5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_FS.getCode());
	betRuleVo.setBetCode("4,3;2,3;2,4;5,1;9,1");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Fs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_FS.getCode());
	betRuleVo.setBetCode("4,3,5");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Fs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_FS.getCode());
	betRuleVo.setBetCode("4,3,1,2,5,0,6,7,8,9");
	betRuleVo.setTimes(45);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2复式，失败：重号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2FsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_FS.getCode());
	betRuleVo.setBetCode("4,3,4");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Dt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("4$3,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Dt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("4$1,2,5,3,0,6,7,8,9");
	betRuleVo.setTimes(9);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2胆拖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2Dt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("5$1,2,4,3,0,6,7,8,9");
	betRuleVo.setTimes(9);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选2胆拖，失败：胆超过1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2DtFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("4,3$5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2DtFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("4$4,3");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选2胆拖，失败：胆拖重复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR2DtFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DT.getCode());
	betRuleVo.setBetCode("4$5,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选43重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("4,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选43重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("5,5,5,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选43重，失败：全重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选43重，失败：2不重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("1,2,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选43重，失败：2双重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43CFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("4,4,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选43重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR43C5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_3C.getCode());
	betRuleVo.setBetCode("4,5,5,5;1,1,1,2;3,3,4,3;9,0,0,0;4,6,4,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选42重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("4,4,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选42重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("6,5,6,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选42重，失败：全重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选42重，失败：3重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("5,4,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选42重，失败：1重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42CFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("3,5,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选42重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42C5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("6,5,6,5;5,4,4,5;1,1,9,9;4,7,7,4;5,3,5,3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选42重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR42C5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_2C.getCode());
	betRuleVo.setBetCode("6,5,6,5;5,8,8,5;1,1,9,9;4,7,7,4;5,3,5,3");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选41重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("5,4,5,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选41重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("5,4,5,9");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选41重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41C3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("0,4,0,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选41重，失败：全重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选41重，失败：3重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("5,5,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选41重，失败：2重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41CFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("5,4,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选41重，失败：全不重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR41CFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX4_DS_1C.getCode());
	betRuleVo.setBetCode("1,2,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选33重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选33重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("4,4,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选33重，失败：超过3个号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("5,5,5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选33重，失败：2重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("5,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选33重，失败：全不重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33CFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("3,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选33重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33C5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("5,5,5;1,1,1;4,4,4;7,7,7;0,0,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选33重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR33C5z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_3C.getCode());
	betRuleVo.setBetCode("3,3,3;1,1,1;4,4,4;7,7,7;0,0,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选32重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("5,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选32重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("5,5,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选32重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32C3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("4,5,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选32重，失败：全重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("4,4,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选32重，失败：全不重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("1,3,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选32重，失败：任选4的1重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32CFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("1,2,4,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选32重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR32C5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX3_DS_2C.getCode());
	betRuleVo.setBetCode("5,5,3;4,4,5;5,4,5;1,1,9;0,8,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选22重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22C1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("5,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选22重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22C2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("4,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选22重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22C3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("1,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：任选22重，不重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22CFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("1,2");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选22重，失败：任选32重<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22CFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("4,5,4");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：任选22重5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testR22C5z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("1,1;5,5;4,4;3,3;0,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：大额投注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testLarge() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_ZXFS_41.getCode());
	betRuleVo.setBetCode("1234567890,256789,15340,134579,02568");
	betRuleVo.setTimes(9000);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：投注失败，倍数非法<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_HN41_RX2_DS_2C.getCode());
	betRuleVo.setBetCode("1,1;5,5;4,4;3,3;0,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(0);

	this.bet(betRuleVo, false);
    }
}
