// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.constant;


/**
 * 类 名: ErrorTypeEnum<br/>
 * 描 述: 代销者选注方式枚举<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public enum ErrorTypeEnum {

    JK_OPEN_IN_1("即开 刮开 入参 投注账号为null"),

    JK_OPEN_IN_2("即开 刮开 入参 投注账号为空串"),

    JK_OPEN_IN_3("即开 刮开 入参 投注记录数组为null"),

    JK_OPEN_IN_4("即开 刮开 入参 投注记录数组.length=0");

    private final String remark_;

    private ErrorTypeEnum(String remark) {
	this.remark_ = remark;
    }

    public String getRemark() {
	return remark_;
    }

}
