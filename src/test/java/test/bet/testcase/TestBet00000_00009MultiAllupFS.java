// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.bet.testcase;

import org.junit.Test;

import test.bet.TestBetBase;
import test.common.constant.ChoseJczqSelTypeEnum;
import test.common.vo.BetRuleJczqVo;

import com.uuzz.lottery.constant.game.BetWayEnum;
import com.uuzz.lottery.constant.game.GameEnum;

/**
 * 类 名: TestBet00000MultiAllupFS<br/>
 * 描 述: 竞彩足球 让球胜平负/胜平负/前两者混合过关 自由过关 复式 测试用例<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestBet00000_00009MultiAllupFS extends TestBetBase {

//     private static final String GAMECODE = GameEnum.JCZQ_RQSPF.getGameCode();

//    private static final String GAMECODE = GameEnum.JCZQ_SPF.getGameCode();

     private static final String GAMECODE = GameEnum.JCZQ_HHGG.getGameCode();

    /**
     * 描 述：自由过关 3场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_3c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 3场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_3c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_2x1, BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 4场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_4c_6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_2x1, BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_2x1, BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_8() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_9() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_10() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 5场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_5c_11() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(5);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_8() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_9() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_10() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_11() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_12() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_13() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_14() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_15() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_20() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_21() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_22() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_23() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 6场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_6c_24() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(6);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_8() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_9() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_10() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_11() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_12() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_13() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_14() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_15() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_16() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_17() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_18() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_19() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_20() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_21() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_22() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_23() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_24() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_25() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_26() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_27() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_28() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_29() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_30() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_31() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_32() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_33() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_34() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_35() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_36() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 7场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_7c_37() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(7);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_8() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_9() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_10() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_11() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_12() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_13() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_14() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_15() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_16() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_17() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_18() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_19() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_20() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_21() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_22() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_23() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_24() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_25() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_26() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_27() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_28() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_29() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_30() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_31() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_32() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_33() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_34() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_35() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_36() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_37() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_38() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_39() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_40() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_41() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_42() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_43() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_44() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_45() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_46() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_47() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_48() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_49() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_50() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_51() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_52() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_53() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_54() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_55() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_56() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_57() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_58() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_59() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_60() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_61() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_62() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_63() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_64() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_65() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_66() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_67() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_68() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_4x1, BetWayEnum.JCZQ_RQSPF_5x1,
		BetWayEnum.JCZQ_RQSPF_6x1, BetWayEnum.JCZQ_RQSPF_7x1,
		BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_69() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关 8场 单式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_8c_70() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1, BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1, BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1, BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(1);
	betRuleVo.setWantPoolCount(8);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo);
    }

    /**
     * 描 述：自由过关投注失败：含单场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail1() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0,
		BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：含单场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail2() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_1x0,
		BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：含非串1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail3() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x3,
		BetWayEnum.JCZQ_RQSPF_2x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：含非串1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail4() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x3,
		BetWayEnum.JCZQ_RQSPF_2x1, BetWayEnum.JCZQ_RQSPF_4x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：含非串1<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail5() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_3x1,
		BetWayEnum.JCZQ_RQSPF_2x1, BetWayEnum.JCZQ_RQSPF_4x4 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(4);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：超过8场<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail6() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(9);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：投注不可售奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail7() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_2x1,
		BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnsalePool(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：投注不支持过关奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail8() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_3x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnableAllup(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：投注不可售选项<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail9() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_4x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setChoseUnsaleSel(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：注数错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail10() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_5x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setTimes(3);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：投注金额错误<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail11() {
	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_6x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setWantPoolCount(8);
	betRuleVo.setBetMoney(100);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

    /**
     * 描 述：自由过关投注失败：混合过关，选择同一场赛事的不同奖池<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testMutilAllup_FS_Fail12() {
	if (!GAMECODE.equals(GameEnum.JCZQ_HHGG.getGameCode())) {
	    return;
	}

	BetRuleJczqVo betRuleVo = new BetRuleJczqVo(GAMECODE);
	betRuleVo.setDetailType(new BetWayEnum[] { BetWayEnum.JCZQ_RQSPF_8x1,
		BetWayEnum.JCZQ_RQSPF_7x1 });
	betRuleVo.setChoseSelType(ChoseJczqSelTypeEnum.FS);
	betRuleVo.setMultiple(2);
	betRuleVo.setChoseSameMatchDiffPool(true);

	betRuleVo.autoChoseSel();
	this.bet(betRuleVo, false);
    }

}
