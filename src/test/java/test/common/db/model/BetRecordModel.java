// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.db.model;

import java.io.Serializable;

/**
 * 类 名: BetRecordModel<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class BetRecordModel implements Serializable, Cloneable {

    /**
     * 
     */
    private static final long serialVersionUID = -7296370992907150096L;

    public String getAgentNo() {
	return agentNo;
    }

    public void setAgentNo(String agentNo) {
	this.agentNo = agentNo;
    }

    public String getAgentSerial() {
	return agentSerial;
    }

    public void setAgentSerial(String agentSerial) {
	this.agentSerial = agentSerial;
    }

    private String agentNo;
    private String agentSerial;

    @Override
    public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

}
