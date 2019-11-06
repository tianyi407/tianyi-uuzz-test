// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.constant;


/**
 * 类 名: SelectTypeEnum<br/>
 * 描 述: 代销者选注方式枚举<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public enum OpenStateJkEnum {

    NO(0, "未刮开"),

    YES(1, "已刮开");

    private final int value_;

    private final String remark_;

    private OpenStateJkEnum(int value, String remark) {
	this.value_ = value;
	this.remark_ = remark;
    }

    public int getValue() {
	return value_;
    }

    public String getRemark() {
	return remark_;
    }

}
