// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.bet.service;

import java.util.Random;
import java.util.UUID;

import test.common.config.SystemConfig;
import test.common.vo.AccountVo;
import test.common.vo.BetRuleVo;

import com.uuzz.lottery.abgw.constant.OperationSystemEnum;
import com.uuzz.lottery.trade.entity.AccountInfo;
import com.uuzz.lottery.trade.entity.BetReq;
import com.uuzz.lottery.trade.entity.BetResp;
import com.uuzz.lottery.trade.entity.BetResult;
import com.uuzz.utils.StringUtil;

/**
 * 类 名: BetBase<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月4日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class BetBase {

    protected static final String LOG_BLANK_SPACE = "                             ";

    /**
     * 描 述：随机获取一个操作系统标识<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    protected String getRandomOs() {
	int i = new Random().nextInt(3) + 1;
	for (OperationSystemEnum e : OperationSystemEnum.values()) {
	    i--;
	    if (i == 0) {
		return e.getOsCode();
	    }
	}

	return OperationSystemEnum.WINDOWS.getOsCode();
    }

    /**
     * 描 述：获取省编码370000或460000<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    protected String getProvinceCode() {
	String agentNo = SystemConfig.AGENT_NO + "";
	String provinceCode = agentNo.substring(0, 2) + "0000";
	return provinceCode;
    }
    
    /**
     * 描 述：从VO转换成ice接口实体<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param betRuleVo
     * @return
     */
    public BetReq getInParam(BetRuleVo betRuleVo) {
	BetReq req = new BetReq();
	return this.buildInParam(req, betRuleVo);
    }

    /**
     * 描 述：从VO转换成ice接口实体<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @param betRuleVo
     * @return
     */
    public BetReq buildInParam(BetReq in, BetRuleVo betRuleVo) {
	AccountVo accountVo = AccountVo.getDefaultAccount();
	return this.buildInParam(in, accountVo, betRuleVo);
    }

    protected BetReq buildInParam(BetReq in, AccountVo accountVo,
	    BetRuleVo betRuleVo) {
	// 代销者编号
	in.agentNo = SystemConfig.AGENT_NO + "";
	// 代销者流水号
	in.agentSerial = UUID.randomUUID().toString();
	// 总局编码 99101
	in.gameCode = betRuleVo.getGameCode();

	// 投注账号
	in.bettingNo = accountVo.getBettingNo();
	// 投注账户所在地区码
	in.areaCode = accountVo.getAreaCode();
	// 投注密码
	in.betPassword = accountVo.getBetPassword();
	// 手机号码
	in.mobile = accountVo.getMobile();

	// 投注数量（注数）
	in.times = betRuleVo.getTimes();
	// 投注倍数
	in.multy = betRuleVo.getMultiple();

	// (0:不允许奖金投注 1：允许奖金投注) 奖金投注取消确认操作
	in.isTransferAccount = 1;
	// 红包金额
	in.bonusBetMoney = 0;
	// 红包流水
	in.bonusSerial = null;
	// 活动ID
	in.activityId = null;
	// 操作系统
	in.os = this.getRandomOs();

	return in;
    }

    protected String getPrintMsgReq(BetReq in) {

	String format = StringUtil.NEW_LINE
		+ "======投注请求：agentNo = [%s], agentSerial=[%s], "
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "gameCode=[%s], bettingNo=[%s], areaCode=[%s], betPassword=[%s], mobile=[%s], "
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "times=[%s], multy=[%s], betMoney=[%s], isTransferAccount=[%s],"
		+ StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "bonusBetMoney=[%s], bonusSerial=[%s], activityId=[%s], os=[%s],";

	return String.format(format, in.agentNo, in.agentSerial, in.gameCode,
		in.bettingNo, in.areaCode, in.betPassword, in.mobile, in.times,
		in.multy, in.betMoney, in.isTransferAccount, in.bonusBetMoney,
		in.bonusSerial, in.activityId, in.os);
    }

    protected void printInParam(BetReq in) {
	String log = this.getPrintMsgReq(in);
	System.out.println(log);
    }

    private String getPrintMsgRespBase(BetResp out) {

	String format = StringUtil.NEW_LINE
		+ "======投注响应：status = [%s], resultCode = [%s], msg = [%s]======";

	return String.format(format, out.status, out.resultCode, out.msg);
    }

    private String getPrintMsgRespAccount(BetResp out) {
	StringBuffer sb = new StringBuffer();
	sb.append(StringUtil.NEW_LINE);

	AccountInfo acc = out.accInfo;
	if (acc == null) {
	    sb.append("-----------AccountInfo：is NULL-----------");
	} else {
	    String format = StringUtil.NEW_LINE
		    + "-----------AccountInfo：非空，详情如下：-----------"
		    + StringUtil.NEW_LINE
		    + LOG_BLANK_SPACE
		    + "bettingNo=[%s], balance=[%s], prizeBalance=[%s], debt=[%s], accBonus=[%s], payaward=[%s], todayCreditMoney=[%s].";

	    String log = String.format(format, acc.bettingNo, acc.balance,
		    acc.prizeBalance, acc.debt, acc.accBonus, acc.payaward,
		    acc.todayCreditMoney);

	    sb.append(log);
	}
	
	sb.append(StringUtil.NEW_LINE);
	return sb.toString();
    }

    protected String getPrintMsgRespBetResult(BetResult result) {
	String format = StringUtil.NEW_LINE
		+ LOG_BLANK_SPACE
		+ "betState=[%s], agentSerial=[%s], lotteryCode=[%s], elecCode=[%s], security=[%s],"
		+ StringUtil.NEW_LINE + LOG_BLANK_SPACE
		+ "betTime=[%s], centerBetTime=[%s], sellTime=[%s].";

	return String.format(format, result.betState, result.agentSerial,
		result.lotteryCode, result.elecCode, result.security,
		result.betTime, result.centerBetTime, result.sellTime);
    }

    protected void printOutParam(BetResp out, BetResult result) {
	String baseLog = this.getPrintMsgRespBase(out);
	String betLog = this.getPrintMsgRespBetResult(result);
	String accLog = this.getPrintMsgRespAccount(out);

	System.out.println(baseLog + betLog + accLog);
    }

}
