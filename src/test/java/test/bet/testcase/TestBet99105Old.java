// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99105Old<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99105Old extends TestBetBase {

    private static final String GAMECODE = GameEnum.DC_QXC.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_DS.getCode());
	betRuleVo.setBetCode("7,6,5,4,3,2,1");
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
    public void testDs5z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_DS.getCode());
	betRuleVo.setBetCode("6,7,1,3,8,2,8;1,9,0,3,2,2,7;8,6,1,3,8,0,9;9,6,7,1,0,5,9;4,9,5,4,7,9,8");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式5注失败，投注方式为：复式 <br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs5zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("6,7,1,3,8,2,8;1,9,0,3,2,2,7;8,6,1,3,8,0,9;9,6,7,1,0,5,9;4,9,5,4,7,9,8");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("25,29,26,26,27,24,127");
	betRuleVo.setTimes(192);
	betRuleVo.setMultiple(2);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：一等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,56,67,70");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：2等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,56,67,80");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：3等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,56,87,80");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,96,87,80");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：5等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,05,96,87,80");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：6等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade6() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,14,05,96,87,80");
	betRuleVo.setTimes(128);
	betRuleVo.setMultiple(3);

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
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("1234567890,56789,01234,13579,02468,6,7");
	betRuleVo.setTimes(6250);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：大额未中奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testNoPrize() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("234567890,056789,0124,013579,0123468,9,0");
	betRuleVo.setTimes(9072);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }


    /**
     * 描 述：投注失败，超出2W金额<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("234567890,056789,0124,013579,0123468,9,0");
	betRuleVo.setTimes(9072);
	betRuleVo.setMultiple(99);

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
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_DS.getCode());
	betRuleVo.setBetCode("6,7,1,3,8,2,8;1,9,0,3,2,2,7;8,6,1,3,8,0,9;9,6,7,1,0,5,9;4,9,5,4,7,9,8;1,2,3,4,5,6,7");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }
}
