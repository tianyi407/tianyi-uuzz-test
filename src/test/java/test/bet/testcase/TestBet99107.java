// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99107<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99107 extends TestBetBase {

    private static final String GAMECODE = GameEnum.DC_P5.getGameCode();

    /**
     * 描 述：直选单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs1z1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXDS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5");
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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXDS.getCode());
	betRuleVo.setBetCode("0,2,3,4,5");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(88);

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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXDS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5;0,1,2,3,4;1,2,3,4,6;9,2,3,4,5;8,7,6,5,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(10);

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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXDS.getCode());
	betRuleVo.setBetCode("1,2,3,4,7;0,1,2,3,4;1,2,3,4,6;9,2,3,4,5;8,7,6,5,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选单式5注失败：投注方式为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxDs5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXFS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5;0,1,2,3,4;1,2,3,4,0;9,2,3,4,5;8,7,6,5,4");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(10);

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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXFS.getCode());
	betRuleVo.setBetCode("01,2,3,4,5");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(2);

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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXFS.getCode());
	betRuleVo.setBetCode("01234,01234,12340,12340,56789");
	betRuleVo.setTimes(3125);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxFs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXFS.getCode());
	betRuleVo.setBetCode("01234,01234,1240,12340,56789");
	betRuleVo.setTimes(2500);
	betRuleVo.setMultiple(4);

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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5");
	betRuleVo.setTimes(120);
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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,6,7,0");
	betRuleVo.setTimes(6720);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：直选组合复式，失败：超过8个号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhFsFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,6,7,8,9,0");
	betRuleVo.setTimes(30240);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：直选组合复式，失败：超过8个号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhFsFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("0,1,2,3,4,5,6,7,8");
	betRuleVo.setTimes(15120);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：直选组合复式，失败：重复数字<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testZxZhFsFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("0,1,2,3,4,5,5");
	betRuleVo.setTimes(2520);
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
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXFS.getCode());
	betRuleVo.setBetCode("1234567890,02468,13579,567894,123405");
	betRuleVo.setTimes(9000);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }


    /**
     * 描 述：投注失败，投注金额超过2万<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXZHFS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,6,7,0");
	betRuleVo.setTimes(6720);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注失败，单式6注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_P5_ZXDS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5;0,1,2,3,4;1,2,3,4,6;9,2,3,4,5;8,7,6,5,4;7,8,5,3,1");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(10);

	this.bet(betRuleVo, false);
    }
}
