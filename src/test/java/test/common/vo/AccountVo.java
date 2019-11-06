// Copyright (C) 2012-2016 UUZZ All rights reserved
package test.common.vo;

import com.uuzz.security.Md5;

/**
 * 类 名: AccountVo<br/>
 * 描 述: 账户信息VO<br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2016年12月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class AccountVo {

    private String bettingNo;

    private String betPassword;

    private String areaCode;

    private String mobile;

    public String getBettingNo() {
	return bettingNo;
    }

    public void setBettingNo(String bettingNo) {
	this.bettingNo = bettingNo;
    }

    public String getBetPassword() {
	return betPassword;
    }

    public void setBetPassword(String betPassword) {
	this.betPassword = this.toMD5(betPassword);
    }

    public String getAreaCode() {
	return areaCode;
    }

    public void setAreaCode(String areaCode) {
	this.areaCode = areaCode;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    private String toMD5(String content) {
	return new Md5().md5ForStr(content);
    }

    /**
     * 描 述：获取默认王天一的账户<br/>
     * 作 者：Wang Tianyi<br/>
     * 历 史: (版本) 作者 时间 注释 <br/>
     * 
     * @return
     */
    public static AccountVo getDefaultAccount() {
	AccountVo vo = new AccountVo();

	// 2X 用户1
	vo.setBettingNo("46000008002");
	vo.setAreaCode("469028");
	vo.setBetPassword("199097");
	vo.setMobile("18811048407");
	
	//2X 用户2
//	vo.setBettingNo("46000034005");
//	vo.setAreaCode("460106");
//	vo.setBetPassword("199097");
//	vo.setMobile("13880956567");
	
	// 4X 用户1
//	vo.setBettingNo("37000002009");
//	vo.setAreaCode("370102");
//	vo.setBetPassword("199097");
//	vo.setMobile("18811048407");
	
	// 4X 用户2
//	vo.setBettingNo("37000002010");
//	vo.setAreaCode("370214");
//	vo.setBetPassword("199097");
//	vo.setMobile("18801458407");
	
	return vo;
    }
}
