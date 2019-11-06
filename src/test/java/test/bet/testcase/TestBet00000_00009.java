// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.constant.ChoseJczqSelTypeEnum;
import test.common.vo.BetRuleJczqVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet00000<br/>
 * 描 述: 竞彩足球 让球胜平负/胜平负/前两者混合过关 单场、组合过关测试用例<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet00000_00009 extends TestBetBase {

     private static final String GAMECODE = GameEnum.JCZQ_RQSPF.getGameCode();

//    private static final String GAMECODE = GameEnum.JCZQ_SPF.getGameCode();

//     private static final String GAMECODE = GameEnum.JCZQ_HHGG.getGameCode();

    /**
     * 描 述：单场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	// 下列选项可自定义设置；若不设置，则自动设为默认值
	// 如setWantPoolCount，为想要选的奖池数；默认为过关方式中最大关数
	// 如setTimes，为投注注数；默认为自动计算的正确注数

	// betRuleVo.setWantPoolCount(7);
	// betRuleVo.setChoseUnsalePool(true);
	// betRuleVo.setChoseUnableAllup(true);
	// betRuleVo.setChoseUnsaleSel(true);
	// betRuleVo.setChoseSameMatchDiffPool(true);
	// betRuleVo.setTimes(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：单场 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：单场 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：单场 8场 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：单场 5场 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(99);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：单场失败：9场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(9);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单场失败：投注不可售奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnsalePool(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单场失败：投注不支持单关奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnableAllup(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单场失败：投注不可售选项<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnsaleSel(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单场失败：注数错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(2);
	betRuleVo.setTimes(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：单场失败：投注金额错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test1x0Fail6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setBetMoney(200);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：2x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test2x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：2x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test2x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(89);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：2x3 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test2x3_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x3 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(79);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：2x3 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test2x3_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x3 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(69);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：3x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(59);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(49);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x3 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x3_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x3 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(39);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x3 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x3_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x3 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(29);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x4 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x4_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x4 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(19);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x4 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x4_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x4 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(9);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：3x6 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x6_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：3x6 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x6_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：3x7 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x7_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：3x7 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test3x7_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x4 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x4_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x4 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x4 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x4_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x4 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x5 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x5_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x5 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x5 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x5_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x5 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x6 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x6_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x6 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x6_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x10 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x10_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x10 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x10 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x10_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x10 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x11 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x11_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x11 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x11 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x11_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x11 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：4x14 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x14_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x14 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x14 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x14_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x14 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x15 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x15_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：4x15 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test4x15_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x5 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x5_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x5 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x5 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x5_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x5 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x6 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x6_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x6 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x6_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x10 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x10_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x10 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x10 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x10_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x10 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x15 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x15_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x15 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x15_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x16 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x16_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x16 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x16 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x16_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x16 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x20 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x20_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x20 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x20 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x20_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x20 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x25 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x25_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x25 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x25 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x25_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x25 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x26 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x26_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x26 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x26 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x26_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x26 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：5x30 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x30_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x30 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x30 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x30_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x30 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x31 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x31_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x31 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：5x31 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test5x31_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x31 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x6 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x6_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x6 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x6_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x6 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x7 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x7_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x7 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x7_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x15 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x15_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x15 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x15_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x15 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x20 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x20_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x20 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x20 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x20_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x20 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x21 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x21_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x21 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x21 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x21_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x21 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x22 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x22_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x22 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x22 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x22_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x22 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x35 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x35_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x35 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x35 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x35_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x35 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x41 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x41_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x41 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x41 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x41_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x41 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x42 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x42_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x42 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x42 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x42_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x42 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x50 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x50_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x50 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x50 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x50_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x50 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x56 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x56_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x56 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x56 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x56_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x56 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x57 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x57_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x57 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x57 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x57_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x57 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：6x62 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x62_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x62 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x62 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x62_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x62 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x63 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x63_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x63 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：6x63 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test6x63_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x63 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：7x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x7 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x7_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x7 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x7_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x7 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x8 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x8_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x8 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x8_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x21 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x21_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x21 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x21 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x21_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x21 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x35 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x35_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x35 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x35 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x35_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x35 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x120 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x120_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x120 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x120 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x120_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x120 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：7x127 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x127_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x127 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：7x127 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test7x127_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x127 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：8x1 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x1_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x1 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x1_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x8 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x8_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x8 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x8_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x9 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x9_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x9 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x9 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x9_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x9 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x28 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x28_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x28 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x28 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x28_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x28 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x56 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x56_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x56 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x56 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x56_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x56 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x70 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x70_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x70 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(99);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x70 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x70_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x70 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x247 单式（大额投注）<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x247_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x247 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(40);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x247 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x247_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x247 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：8x255 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x255_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x255 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：8x255 复式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void test8x255_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x255 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：场数、关数不一致<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x11 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：场数、关数不一致<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(9);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：投注不可售奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setChoseUnsalePool(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：投注不支持过关奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.DS);
	betRuleVo.setMultiple(2);
	betRuleVo.setChoseUnableAllup(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：投注不可售选项<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setChoseUnsaleSel(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：注数错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x3 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setTimes(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：投注金额错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo
		.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x10 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setBetMoney(200);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：组合过关失败：混合过关，选择同一场赛事的不同奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testAllupFail8() {
	if (!GAMECODE.equals(GameEnum.JCZQ_HHGG.getGameCode())) {
	    return;
	}

	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_HHGG_8x8 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setChoseSameMatchDiffPool(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    // 投注奖池gameCode和投注记录GameCode不一致；可以临时修改BetJczq.java

}
