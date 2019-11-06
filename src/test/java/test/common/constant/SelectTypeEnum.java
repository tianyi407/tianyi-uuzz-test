// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.constant;

import java.util.Random;

/**
 * 类 名: SelectTypeEnum<br/>
 * 描 述: 代销者选注方式枚举<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public enum SelectTypeEnum {

    ZX("10", "自选"),

    JX("20", "机选"),

    FZ("30", "复制"),

    TZD("40", "投注单");

    private final String value_;

    private final String remark_;

    private SelectTypeEnum(String value, String remark) {
	this.value_ = value;
	this.remark_ = remark;
    }

    public String getValue() {
	return value_;
    }

    public String getRemark() {
	return remark_;
    }

    /**
     * 描 述：随机获得一种选注方式<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return String of SelectTypeEnum.value
     */
    public static String getRandomSelectType() {
	int i = new Random().nextInt(4) + 1;
	for (SelectTypeEnum e : SelectTypeEnum.values()) {
	    i--;
	    if (i == 0) {
		return e.getValue();
	    }
	}

	return SelectTypeEnum.ZX.getValue();
    }

}
