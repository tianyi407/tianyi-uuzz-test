// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.open;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import test.BaseTest;
import test.common.vo.OpenVo;
import test.open.service.OpenJk;

import com.uuzz.lottery.constant.ResultConstant;
import com.uuzz.lottery.trade.entity.OpenUpBatchResp;
import com.uuzz.lottery.trade.entity.OpenUpResult;

/**
 * 类 名: TestOpenBase<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月27日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class TestOpenBase extends BaseTest {

    @Autowired
    private OpenJk openJkService;

    protected void open(OpenVo openVo) {
	this.open(openVo, true);
    }

    protected void open(OpenVo openVo, boolean isCheckSuccess) {
	openVo = openJkService.getInParam(openVo);
	OpenUpBatchResp out = openJkService.open(openVo);
	this.checkResult(openVo, out, isCheckSuccess);

    }

    private void checkResult(OpenVo openVo, OpenUpBatchResp out,
	    boolean isCheckSuccess) {
	int status = out.status;
	int realCount = openVo.getRealCount();
	int resultCount = out.openUpResults.length;
	System.out
		.println(String
			.format("======刮开总数量：wantCount = [%s], lotteryCodeList.size = [%s], realCount = [%s],  resultCount = [%s]======",
				openVo.getWantCount(), openVo
					.getLotteryCodeList().size(),
				realCount, resultCount));

	if (isCheckSuccess) {
	    Assert.assertEquals(ResultConstant.SUCCESS, status);
	    Assert.assertEquals(realCount, resultCount);
	} else {
	    Assert.assertEquals(ResultConstant.FAILURE, status);
	}

	for (OpenUpResult result : out.openUpResults) {
	    String s = String
		    .format("=======刮开结果：lotteryCode = [%s], status = [%s], resultCode = [%s], msg = [%s], grade = [%s], bingoMoney = [%s], afterBingoMoney = [%s], openTime = [%s], isGreat = [%s] =======",
			    result.lotteryCode, result.status,
			    result.resultCode, result.msg, result.grade,
			    result.bingoMoney, result.afterBingoMoney,
			    result.openTime, result.isGreat);
	    System.out.println(s);
	}

    }

}
