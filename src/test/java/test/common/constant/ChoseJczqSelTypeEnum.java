// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.constant;

/**
 * 类 名: ChoseJczqSelTypeEnum<br/>
 * 描 述: 竞彩足球自动选定选项方式枚举<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public enum ChoseJczqSelTypeEnum {

    DS(1, "单式，可售选项"),

    FS(100, "复式，全包可售选项");

    private final int maxSelCount_;

    private final String remark_;

    private ChoseJczqSelTypeEnum(int maxSelCount, String remark) {
	this.maxSelCount_ = maxSelCount;
	this.remark_ = remark;
    }

    public int getMaxSelCount() {
	return maxSelCount_;
    }

    public String getRemark() {
	return remark_;
    }

}
