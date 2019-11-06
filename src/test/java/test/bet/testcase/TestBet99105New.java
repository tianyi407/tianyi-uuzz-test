// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99105New<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99105New extends TestBetBase {

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
	betRuleVo.setBetCode("7,6,5,4,3,2,@");
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
	betRuleVo.setBetCode("6,7,1,3,8,2,G;1,9,0,3,2,2,F;8,6,1,3,8,0,M;9,6,7,1,0,5,N;4,9,5,4,7,9,C");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo);
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
	betRuleVo.setBetCode("25,29,36,26,27,64,@ABCDEFGHIJKLMN");
	betRuleVo.setTimes(960);
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
	betRuleVo.setBetCode("12,23,34,45,56,67,F@");
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
	betRuleVo.setBetCode("12,23,34,45,56,67,CK");
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
	betRuleVo.setBetCode("12,23,34,45,56,87,@F");
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
    public void testGrade41() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,56,87,AL");
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
    public void testGrade42() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,96,87,BF");
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
    public void testGrade51() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,45,96,87,DH");
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
    public void testGrade52() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,05,96,87,DF");
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
    public void testGrade61() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,34,05,96,87,DJ");
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
    public void testGrade62() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("12,23,14,05,96,87,EF");
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
    public void testGrade63() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("02,23,14,05,96,87,GF");
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
    public void testGrade64() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("02,93,14,05,96,87,HF");
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
	betRuleVo.setBetCode("1234567890,56789,01234,13579,02468,6,F");
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
	betRuleVo.setBetCode("234567890,056789,0124,013579,0123468,9,L");
	betRuleVo.setTimes(9072);
	betRuleVo.setMultiple(1);

	this.bet(betRuleVo);
    }


    /**
     * 描 述：投注失败，注数错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_FS.getCode());
	betRuleVo.setBetCode("234567890,056789,0124,013579,0123468,9,N1");
	betRuleVo.setTimes(9072);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：投注失败，单式7注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_QXC_DS.getCode());
	betRuleVo.setBetCode("6,7,1,3,8,2,G;1,9,0,3,2,2,F;8,6,1,3,8,0,M;9,6,7,1,0,5,N;4,9,5,4,7,9,C;7,6,5,4,3,2,@;6,5,4,3,2,1,A");
	betRuleVo.setTimes(7);
	betRuleVo.setMultiple(99);

	this.bet(betRuleVo, false);
    }
    
    
}
