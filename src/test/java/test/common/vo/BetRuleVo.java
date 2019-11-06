// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.vo;

import com.uuzz.icegrid.IceException;
import com.uuzz.lottery.constant.game.GameEnum;
import com.uuzz.lottery.constant.game.GameTypeEnum;
import com.uuzz.lottery.manager.IceServiceProxy;
import com.uuzz.lottery.manager.constant.product.ProductStateEnum;
import com.uuzz.lottery.manager.entity.DrawEntity;
import com.uuzz.lottery.manager.entity.RuleByStateResp;
import com.uuzz.lottery.manager.entity.RuleEntity;
import com.uuzz.lottery.manager.entity.SellingDrawsResp;
import com.uuzz.lottery.manager.service.SentServiceToPassportPrx;
import com.uuzz.lottery.manager.service.SentServiceToTradePrx;

/**
 * 类 名: BetRuleVo<br/>
 * 描 述: 通用投注信息VO<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class BetRuleVo {

    private String gameCode;
    private String period;
    private String betCode;
    private int isAdd;
    private int times;
    private int multiple;
    private String detailType;
    private long betMoney;

    public BetRuleVo() {
    }

    public BetRuleVo(String gameCode) {
	this.gameCode = gameCode;
	DrawEntity draw = this.getSalePeriod(gameCode);
	if (draw != null) {
	    this.period = draw.period;
	}

	GameTypeEnum type = GameEnum.findByGameCode(gameCode).getGameType();
	if (type.equals(GameTypeEnum.JK)) {
	    this.times = 1;
	    this.multiple = 1;
	}
    }

    public String getGameCode() {
	return gameCode;
    }

    public void setGameCode(String gameCode) {
	this.gameCode = gameCode;
    }

    public String getPeriod() {
	return period;
    }

    public void setPeriod(String period) {
	this.period = period;
    }

    public String getBetCode() {
	return betCode;
    }

    public void setBetCode(String betCode) {
	this.betCode = betCode;
    }

    public int getIsAdd() {
	return isAdd;
    }

    public void setIsAdd(int isAdd) {
	this.isAdd = isAdd;
    }

    public int getTimes() {
	return times;
    }

    public void setTimes(int times) {
	this.times = times;
    }

    public int getMultiple() {
	return multiple;
    }

    public void setMultiple(int multiple) {
	this.multiple = multiple;
    }

    public String getDetailType() {
	return detailType;
    }

    public void setDetailType(String detailType) {
	this.detailType = detailType;
    }

    public long getBetMoney() {
	return betMoney;
    }

    public void setBetMoney(long betMoney) {
	this.betMoney = betMoney;
    }

    public void calculateBetMoney() {
	if (this.betMoney > 0) {
	    return;
	}

	int price = 0;

	try {
	    SentServiceToTradePrx ice = IceServiceProxy
		    .getManagerForTradeService();
	    RuleByStateResp resp = ice.getRuleByState(
		    Integer.toString(ProductStateEnum.ENABLE.getState()),
		    this.gameCode);
	    RuleEntity rule = resp.rules[0];
	    price = Integer.parseInt(rule.issuePrice);
	    if (this.isAdd == 1) {
		price = Integer.parseInt(rule.addIssuePrice);
	    }

	} catch (IceException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	int betMoney = this.multiple * this.times * price;
	this.setBetMoney(betMoney);
    }

    private DrawEntity getSalePeriod(String gameCode) {

	GameTypeEnum type = GameEnum.findByGameCode(gameCode).getGameType();
	if (type.equals(GameTypeEnum.JCZQ) || type.equals(GameTypeEnum.JK)) {
	    return null;
	}

	try {
	    SentServiceToPassportPrx ice = IceServiceProxy
		    .getManagerForPassportService();
	    SellingDrawsResp out = ice
		    .getSellingDraws(new String[] { gameCode });
	    if (out.saleDraws == null || out.saleDraws.length == 0) {
		return null;
	    } else {
		return out.saleDraws[0];
	    }
	} catch (IceException e) {
	    e.printStackTrace();
	}

	return null;
    }

}
