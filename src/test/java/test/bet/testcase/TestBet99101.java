// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet99101<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet99101 extends TestBetBase {

    private static final String GAMECODE = GameEnum.DC_CJDLT.getGameCode();

    /**
     * 描 述：单式1注<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs1z() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DS.getCode());
	betRuleVo.setBetCode("10,15,26,31,34|8,9");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);
	betRuleVo.setIsAdd(0);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DS.getCode());
	betRuleVo
		.setBetCode("7,9,16,22,32|1,7;1,5,6,20,24|6,9;3,8,10,13,17|2,8;11,12,23,30,34|3,5;8,9,10,11,12|8,9");
	betRuleVo.setTimes(5);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：单式3注失败，投注方式设为复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDs3zFail1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo
		.setBetCode("7,9,16,28,22|1,7;1,10,6,20,24|6,9;3,8,10,13,17|8,2");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo, false);
    }


    /**
     * 描 述：复式 前区<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,3,7,24,25,29|5,6");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(3);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：复式 后区<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5|8,9,10");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(4);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：复式 双区<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,11,19,20,22,25,28|3,6,7,11");
	betRuleVo.setTimes(2772);
	betRuleVo.setMultiple(3);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }
    
    /**
     * 描 述：复式 双区，中基础奖等、加奖、奖池奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFs4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,2,3,4,5,8,9,10,11,12|6,7,8,9,10");
	betRuleVo.setTimes(2520);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖 前胆后单<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDt1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,5,7,3$2,10,9,8|12,8");
	betRuleVo.setTimes(4);
	betRuleVo.setMultiple(11);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖 前胆后复<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDt2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,5,7,3$2,10,9,8|12,6,8");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(25);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖 前单后胆<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDt3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("2,5,8,10,9|7$12,6,8");
	betRuleVo.setTimes(3);
	betRuleVo.setMultiple(25);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖 前复后胆<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDt4() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("2,5,8,10,9,14,12|7$12,6,8");
	betRuleVo.setTimes(63);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：胆拖 前胆后胆<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testDt5() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("2,3,10$1,4,5,8,9,11,12,17,20,29|4,6,7,8,9,10");
	betRuleVo.setTimes(675);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,2,3,4$5,23,16,30,33,32|7$6,4,12");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(33);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：一等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade1Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,5,23,16,30|6$7,4,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(3);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,5,23,16,30|6$8,4,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(5);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：2等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade2Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,5,23,16,30|6$8,4,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,5,23,16,30|3$8,4,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(5);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：3等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade3Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,23,16,30|6$7,4,12");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(39);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$2,23,16,30|6$8,4,12");
	betRuleVo.setTimes(18);
	betRuleVo.setMultiple(5);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：4等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade4Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$23,16,30|6$7,4,12");
	betRuleVo.setTimes(9);
	betRuleVo.setMultiple(42);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$5,23,16,30|2,8,4,12");
	betRuleVo.setTimes(36);
	betRuleVo.setMultiple(5);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：5等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade5Add1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3,4$8,23,16,30|2,6,4,8,12");
	betRuleVo.setTimes(60);
	betRuleVo.setMultiple(12);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：5等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade5Add2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3$8,23,16,30|7$6,8,12");
	betRuleVo.setTimes(12);
	betRuleVo.setMultiple(11);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3$4,8,23,16,30|4$3,8,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(5);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：6等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade6Add1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("3$8,10,23,16,30|7$6,8,12");
	betRuleVo.setTimes(15);
	betRuleVo.setMultiple(67);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：6等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade6Add2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("1,3$8,10,23,16,30|7$3,8,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：6等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGrade6Add3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DT.getCode());
	betRuleVo.setBetCode("35$8,10,23,16,30|6,7,8,12");
	betRuleVo.setTimes(30);
	betRuleVo.setMultiple(9);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖1等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool1() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,10,11,12,27,35|1,8,9,10,12");
	betRuleVo.setTimes(560);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖1等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool1Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,10,11,12,27|1,8,9,10,12");
	betRuleVo.setTimes(210);
	betRuleVo.setMultiple(11);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖2等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool2() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,10,11,12,27|1,3,9,11,12");
	betRuleVo.setTimes(210);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖2等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool2Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,10,11,12,27|1,3,10,11,12");
	betRuleVo.setTimes(210);
	betRuleVo.setMultiple(11);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖3等奖<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,10,11,12,27|1,3,11,12");
	betRuleVo.setTimes(126);
	betRuleVo.setMultiple(7);
	betRuleVo.setIsAdd(0);

	this.bet(betRuleVo);
    }

    /**
     * 描 述：奖池奖3等奖 追加<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGradePool3Add() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,11,12,27|1,3,8,9,10,11,12");
	betRuleVo.setTimes(126);
	betRuleVo.setMultiple(22);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_FS.getCode());
	betRuleVo.setBetCode("1,8,9,11,12,27|1,3,8,9,10,11,12");
	betRuleVo.setTimes(2);
	betRuleVo.setMultiple(22);
	betRuleVo.setIsAdd(1);

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
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DS.getCode());
	betRuleVo
		.setBetCode("7,9,16,22,32|1,7;1,5,6,20,24|6,9;3,8,10,13,17|2,8;11,12,23,30,34|3,5;8,9,10,11,12|8,9;1,2,3,4,5|6,7");
	betRuleVo.setTimes(6);
	betRuleVo.setMultiple(2);
	betRuleVo.setIsAdd(1);

	this.bet(betRuleVo, false);
    }
    
    /**
     * 描 述：单式1注失败，金额错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testFail3() {

	BetRuleVo betRuleVo = new BetRuleVo(GAMECODE);
	betRuleVo.setDetailType(BetWayEnum.DC_CJDLT_DS.getCode());
	betRuleVo.setBetCode("10,15,26,31,34|8,9");
	betRuleVo.setTimes(1);
	betRuleVo.setMultiple(1);
	betRuleVo.setIsAdd(0);
	betRuleVo.setBetMoney(300);

	this.bet(betRuleVo, false);
    }

}
