// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query.testcase;

import org.junit.Test;

import test.query.TestQueryBase;

import com.uuzz.lottery.constant.game.SportTypeEnum;

/**
 * 类 名: TestQueryJcData<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestQueryJcData extends TestQueryBase {
    /**
     * 描 述：查询未开赛赛事（竞彩）：getJcMatchNoStart<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGetJcMatchNoStart1() {
	int sportNo = SportTypeEnum.FB.getNo();
	String version = "-1";
	this.getJcMatchNoStart(sportNo, version);
    }

    /**
     * 描 述：查询指定赛事及赛果（竞彩）：getJcMatchResult<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    @Test
    public void testGetJcMatchResult1() {
	long[] jcMatchIds = new long[] { 488426l, 588375l, 123l, 588375,
		457164l, 588377 };
	this.getJcMatchResult(jcMatchIds);
    }

}
