// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99201<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99201 extends TestBetBase {

    // 中奖号码：*+0+0+0+0+0+0+0+0+0+0+0+*+0
    private static final String GAMECODE = GameEnum.CTZC_SF14.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,1,1,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注，一等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,0,0,0,0,0,0,0,0,0,0,0,3,0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注，一等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("0,0,0,0,0,0,0,0,0,0,0,0,0,0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(22);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注，二等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("0,0,0,0,0,0,0,0,0,0,0,0,0,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式1注，二等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,3,0,0,0,0,0,0,0,0,0,0,3,0");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(50);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式5注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,3,1,1;1,0,3,1,1,1,1,1,1,1,1,1,1,0;1,0,3,1,1,1,1,1,1,1,1,1,0,1;1,0,3,1,1,1,1,1,0,1,1,1,1,1;3,0,0,0,0,0,0,0,0,0,0,0,1,0");
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,3,1,1,1,1,1,3,1,1;1,0,3,1,1,1,1,1,1,1,1,1,1,0;1,0,3,1,1,1,1,3,1,1,1,1,0,1;1,0,3,1,1,1,1,1,0,1,1,1,1,1;3,0,0,0,0,0,0,0,0,0,0,0,1,0");
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,1,1,4");
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
    public void testDsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,3,1,1;1,0,3,1,1,1,1,1,1,1,1,1,1,0;1,0,3,1,1,1,1,1,1,1,1,1,0,1;1,0,3,1,1,1,1,1,0,1,1,1,1,1;3,0,0,0,0,0,0,0,0,0,0,0,1,0;1,0,3,1,1,1,1,1,1,1,1,1,3,3");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注，失败：小于14场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,,3,1,1,1,1,1,1,1,1,1,1,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注，失败：小于14场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,1,3,1,1,1,1,1,1,1,1,1,1,0,3");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注，失败：小于14场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDsFail5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_DS.getCode());
	betRuleVo.setBetCode("1,1,3,1,1,1,1,1,1,1,1,1,1,0,3");
	betRuleVo.setTimes(15);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("310,10,30,10,30,10,30,10,30,0,30,0,30,0");
	betRuleVo.setTimes(3072);
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
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("130,1,30,10,03,10,30,01,30,0,30,0,30,0");
	betRuleVo.setTimes(1536);
	betRuleVo.setMultiple(6);

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
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("310,1,3,10,30,10,30,10,30,0,30,0,30,0");
	betRuleVo.setTimes(768);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：投注失败，注数不正确<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("310,1,3,10,30,10,30,10,30,0,30,0,30,0");
	betRuleVo.setTimes(700);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注失败，小于14场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("310,1,3,10,30,10,,10,30,0,30,0,30,0");
	betRuleVo.setTimes(384);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注失败，大于14场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("310,1,3,10,30,10,30,10,30,0,30,0,30,0,1");
	betRuleVo.setTimes(768);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注方式赋值为任选9的单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_RX9_DS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,1,1,1");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式5注，投注方式赋值 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5zFail() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.CTZC_SF14_FS.getCode());
	betRuleVo.setBetCode("1,0,3,1,1,1,1,1,1,1,1,3,1,1;1,0,3,1,1,1,1,1,1,1,1,1,1,0;1,0,3,1,1,1,1,1,1,1,1,1,0,1;1,0,3,1,1,1,1,1,0,1,1,1,1,1;3,0,0,0,0,0,0,0,0,0,0,0,1,0");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }

}
