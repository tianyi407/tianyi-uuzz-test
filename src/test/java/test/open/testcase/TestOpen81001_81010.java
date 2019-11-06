// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.open.testcase;

import org.junit.Test;

import test.common.constant.ErrorTypeEnum;
import test.common.vo.OpenVo;
import test.open.TestOpenBase;

/**
 * 类 名: TestOpen81001_81010<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestOpen81001_81010 extends TestOpenBase {

    private static final String ACCOUNT_NO = null;

    /**
     * 描 述：刮开10张<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpen1() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);

	// 下列选项可自定义设置；若不设置，则自动设为默认值
	// 如setWantCount，为想要刮开的张数；默认为10张
	// openVo.setWantCount(10);
	// openVo.setGetLotteryCodeFromDB(true);
	// openVo.setContainAnotherRecord(false);
	// openVo.setContainBetFailRecord(false);
	// openVo.setContainDuplicateOpen(true);
	// openVo.setContainDuplicateRecord(false);
	// openVo.setContainNoExistRecord(false);
	// openVo.setChangeBettingNo(false);
	// openVo.setErrorType(ErrorTypeEnum.JK_OPEN_IN_4);

	this.open(openVo);
    }

    /**
     * 描 述：刮开1张<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpen2() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setWantCount(1);

	this.open(openVo);
    }

    /**
     * 描 述：刮开100张<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpen3() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setWantCount(100);

	this.open(openVo);
    }

    /**
     * 描 述：刮开10张，里面什么东西都有<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpen4() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setContainAnotherRecord(true);
	openVo.setContainBetFailRecord(true);
	openVo.setContainDuplicateOpen(true);
	openVo.setContainNoExistRecord(true);

	this.open(openVo);
    }

    /**
     * 描 述：刮开失败：所有的投注记录都不存在<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail1() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setWantCount(2);
	openVo.setGetLotteryCodeFromDB(false);
	openVo.setContainNoExistRecord(true);

	this.open(openVo, false);
    }

    /**
     * 描 述：刮开失败：记录条数超过100<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail2() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setWantCount(101);
	openVo.setGetLotteryCodeFromDB(false);
	openVo.setContainNoExistRecord(true);

	this.open(openVo, false);
    }

    // TODO；未进行该校验
    /**
     * 描 述：刮开失败：入参投注账号为null<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail3() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setErrorType(ErrorTypeEnum.JK_OPEN_IN_1);

	this.open(openVo, false);
    }

    /**
     * 描 述：刮开失败：入参投注账号为空串<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail4() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setErrorType(ErrorTypeEnum.JK_OPEN_IN_2);

	this.open(openVo, false);
    }

    /**
     * 描 述：刮开失败：入参投注记录数组为null<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail5() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setErrorType(ErrorTypeEnum.JK_OPEN_IN_3);

	this.open(openVo, false);
    }

    /**
     * 描 述：刮开失败：入参投注记录数组为null<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail6() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setErrorType(ErrorTypeEnum.JK_OPEN_IN_4);

	this.open(openVo, false);
    }

    /**
     * 描 述：刮开失败：投注账号与所有投注记录不一致<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail7() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setChangeBettingNo(true);

	this.open(openVo);
    }

    /**
     * 描 述：刮开失败：存在重复的投注记录号<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testOpenFail8() {
	OpenVo openVo = new OpenVo(ACCOUNT_NO);
	openVo.setContainDuplicateRecord(true);

	this.open(openVo, false);
    }

}
