// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.query;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import test.BaseTest;
import test.common.vo.QueryBetRecordVo;
import test.query.service.QueryBetRecord;
import test.query.service.QueryJcData;
import test.query.service.QueryManagerSysData;

import com.uuzz.lottery.constant.ResultConstant;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.entity.ResultEntity;
import com.uuzz.lottery.manager.entity.AreaCodeEntityListReturn;
import com.uuzz.lottery.manager.entity.JcMatchNoStartResp;
import com.uuzz.lottery.manager.entity.JcMatchResultResp;
import com.uuzz.lottery.trade.entity.QueryBetRecordReq;

/**
 * 类 名: TestQueryBase<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月27日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestQueryBase extends BaseTest {

    @Autowired
    private QueryBetRecord queryBetRecordService;

    @Autowired
    private QueryJcData queryJcData;

    @Autowired
    private QueryManagerSysData queryManagerSysData;

    protected void queryBetRecord(QueryBetRecordVo queryBetRecordVo) {
	this.queryBetRecord(queryBetRecordVo, true);
    }

    protected void queryBetRecord(QueryBetRecordVo queryBetRecordVo,
	    boolean isCheckSuccess) {
	QueryBetRecordReq[] in = queryBetRecordService
		.getInParam(queryBetRecordVo);

	ResultEntity out = null;
	GameTypeEnum gameType = queryBetRecordVo.getGameType();
	if (GameTypeEnum.JK.equals(gameType)) {
	    out = queryBetRecordService.queryBetRecordJk(in);
	} else if (GameTypeEnum.DC.equals(gameType)) {
	    out = queryBetRecordService.queryBetRecordLt(in);
	} else if (GameTypeEnum.CTZC.equals(gameType)) {
	    out = queryBetRecordService.queryBetRecordCtzc(in);
	} else if (GameTypeEnum.JCZQ.equals(gameType)) {
	    out = queryBetRecordService.queryBetRecordJczq(in);
	}

	this.checkResult(out, isCheckSuccess);
    }

    private void checkResult(ResultEntity out, boolean isCheckSuccess) {
	if (isCheckSuccess) {
	    Assert.assertEquals(ResultConstant.SUCCESS, out.status);
	} else {
	    Assert.assertEquals(ResultConstant.FAILURE, out.status);
	}
    }

    /**
     * 描 述：查询未开赛赛事（竞彩）：getJcMatchNoStart<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public JcMatchNoStartResp getJcMatchNoStart(int sportNo, String version) {
	return queryJcData.getJcMatchNoStart(sportNo, version);
    }

    /**
     * 描 述：查询指定赛事及赛果（竞彩）：getJcMatchResult<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    public JcMatchResultResp getJcMatchResult(long[] jcMatchIds) {
	return queryJcData.getJcMatchResult(jcMatchIds);
    }

    /**
     * 描 述：查询地区代码：getAreaCode<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    protected void getAreaCode() {
	this.getAreaCode(true);
    }

    /**
     * 描 述：查询地区代码：getAreaCode<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     */
    protected void getAreaCode(boolean isCheckSuccess) {
	AreaCodeEntityListReturn resp = queryManagerSysData.getAreaCode();
	this.checkResult(resp, isCheckSuccess);
    }

    private void checkResult(AreaCodeEntityListReturn resp,
	    boolean isCheckSuccess) {
	if (isCheckSuccess) {
	    Assert.assertEquals(ResultConstant.SUCCESS, resp.status);
	} else {
	    Assert.assertEquals(ResultConstant.FAILURE, resp.status);
	}
    }

}
