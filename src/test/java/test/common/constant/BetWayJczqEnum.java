// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.constant;

import com.uuzz.lottery.constant.game.BetWayEnum;

/**
 * 类 名: BetWayJczqEnum<br/>
 * 描 述: 竞彩足球投注方式（过关方式）枚举<br/>
 * 核心在split属性代表该方式可以拆成哪种关数串1<br/>
 * 举例：3X7的split是1,2,3，代表3串7可以拆成单场、2X1、3X1<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public enum BetWayJczqEnum {

    JC_1x0(BetWayEnum.JCZQ_SPF_1x0.getCode(), "1"),

    JC_2x1(BetWayEnum.JCZQ_SPF_2x1.getCode(), "2"),

    JC_2x3(BetWayEnum.JCZQ_SPF_2x3.getCode(), "1,2"),

    JC_3x1(BetWayEnum.JCZQ_SPF_3x1.getCode(), "3"),

    JC_3x3(BetWayEnum.JCZQ_SPF_3x3.getCode(), "2"),

    JC_3x4(BetWayEnum.JCZQ_SPF_3x4.getCode(), "2,3"),

    JC_3x6(BetWayEnum.JCZQ_SPF_3x6.getCode(), "1,2"),

    JC_3x7(BetWayEnum.JCZQ_SPF_3x7.getCode(), "1,2,3"),

    JC_4x1(BetWayEnum.JCZQ_SPF_4x1.getCode(), "4"),

    JC_4x4(BetWayEnum.JCZQ_SPF_4x4.getCode(), "3"),

    JC_4x5(BetWayEnum.JCZQ_SPF_4x5.getCode(), "3,4"),

    JC_4x6(BetWayEnum.JCZQ_SPF_4x6.getCode(), "2"),

    JC_4x10(BetWayEnum.JCZQ_SPF_4x10.getCode(), "1,2"),

    JC_4x11(BetWayEnum.JCZQ_SPF_4x11.getCode(), "2,3,4"),

    JC_4x14(BetWayEnum.JCZQ_SPF_4x14.getCode(), "1,2,3"),

    JC_4x15(BetWayEnum.JCZQ_SPF_4x15.getCode(), "1,2,3,4"),

    JC_5x1(BetWayEnum.JCZQ_SPF_5x1.getCode(), "5"),

    JC_5x5(BetWayEnum.JCZQ_SPF_5x5.getCode(), "4"),

    JC_5x6(BetWayEnum.JCZQ_SPF_5x6.getCode(), "4,5"),

    JC_5x10(BetWayEnum.JCZQ_SPF_5x10.getCode(), "2"),

    JC_5x15(BetWayEnum.JCZQ_SPF_5x15.getCode(), "1,2"),

    JC_5x16(BetWayEnum.JCZQ_SPF_5x16.getCode(), "3,4,5"),

    JC_5x20(BetWayEnum.JCZQ_SPF_5x20.getCode(), "2,3"),

    JC_5x25(BetWayEnum.JCZQ_SPF_5x25.getCode(), "1,2,3"),

    JC_5x26(BetWayEnum.JCZQ_SPF_5x26.getCode(), "2,3,4,5"),

    JC_5x30(BetWayEnum.JCZQ_SPF_5x30.getCode(), "1,2,3,4"),

    JC_5x31(BetWayEnum.JCZQ_SPF_5x31.getCode(), "1,2,3,4,5"),

    JC_6x1(BetWayEnum.JCZQ_SPF_6x1.getCode(), "6"),

    JC_6x6(BetWayEnum.JCZQ_SPF_6x6.getCode(), "5"),

    JC_6x7(BetWayEnum.JCZQ_SPF_6x7.getCode(), "5,6"),

    JC_6x15(BetWayEnum.JCZQ_SPF_6x15.getCode(), "2"),

    JC_6x20(BetWayEnum.JCZQ_SPF_6x20.getCode(), "3"),

    JC_6x21(BetWayEnum.JCZQ_SPF_6x21.getCode(), "1,2"),

    JC_6x22(BetWayEnum.JCZQ_SPF_6x22.getCode(), "4,5,6"),

    JC_6x35(BetWayEnum.JCZQ_SPF_6x35.getCode(), "2,3"),

    JC_6x41(BetWayEnum.JCZQ_SPF_6x41.getCode(), "1,2,3"),

    JC_6x42(BetWayEnum.JCZQ_SPF_6x42.getCode(), "3,4,5,6"),

    JC_6x50(BetWayEnum.JCZQ_SPF_6x50.getCode(), "2,3,4"),

    JC_6x56(BetWayEnum.JCZQ_SPF_6x56.getCode(), "1,2,3,4"),

    JC_6x57(BetWayEnum.JCZQ_SPF_6x57.getCode(), "2,3,4,5,6"),

    JC_6x62(BetWayEnum.JCZQ_SPF_6x62.getCode(), "1,2,3,4,5"),

    JC_6x63(BetWayEnum.JCZQ_SPF_6x63.getCode(), "1,2,3,4,5,6"),

    JC_7x1(BetWayEnum.JCZQ_SPF_7x1.getCode(), "7"),

    JC_7x7(BetWayEnum.JCZQ_SPF_7x7.getCode(), "6"),

    JC_7x8(BetWayEnum.JCZQ_SPF_7x8.getCode(), "6,7"),

    JC_7x21(BetWayEnum.JCZQ_SPF_7x21.getCode(), "5"),

    JC_7x35(BetWayEnum.JCZQ_SPF_7x35.getCode(), "4"),

    JC_7x120(BetWayEnum.JCZQ_SPF_7x120.getCode(), "2,3,4,5,6,7"),

    JC_7x127(BetWayEnum.JCZQ_SPF_7x127.getCode(), "1,2,3,4,5,6,7"),

    JC_8x1(BetWayEnum.JCZQ_SPF_8x1.getCode(), "8"),

    JC_8x8(BetWayEnum.JCZQ_SPF_8x8.getCode(), "7"),

    JC_8x9(BetWayEnum.JCZQ_SPF_8x9.getCode(), "7,8"),

    JC_8x28(BetWayEnum.JCZQ_SPF_8x28.getCode(), "6"),

    JC_8x56(BetWayEnum.JCZQ_SPF_8x56.getCode(), "5"),

    JC_8x70(BetWayEnum.JCZQ_SPF_8x70.getCode(), "4"),

    JC_8x247(BetWayEnum.JCZQ_SPF_8x247.getCode(), "2,3,4,5,6,7,8"),

    JC_8x255(BetWayEnum.JCZQ_SPF_8x255.getCode(), "1,2,3,4,5,6,7,8");

    // 过关方式代码
    private final String code;

    // split属性代表该方式可以拆成哪种串关
    // 举例：3X7的split是1,2,3，代表3串7可以拆成单场、2X1、3X1
    private final String split;

    private BetWayJczqEnum(String code, String split) {
	this.code = code;
	this.split = split;
    }

    public String getCode() {
	return code;
    }

    public String getSplit() {
	return split;
    }

    public static BetWayJczqEnum find(String code) {
	for (BetWayJczqEnum way : BetWayJczqEnum.values()) {
	    if (way.code.equals(code)) {
		return way;
	    }
	}

	return null;
    }

}
