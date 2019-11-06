/**   
 * 版本 V1.02
 * Copyright 2012 北京壹平台科技有限公司 
 */
package test.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 类名: SystemConfig<br>
 * 类描述: 加载配置信息<br>
 * 作成者: Tony Wang<br>
 * 作成日期 2012-10-31 下午06:15:19<br>
 */
@Component
public class SystemConfig {
	
	/**
	 * 代销者编号
	 */
	public static int AGENT_NO;
	
	/**
	 * 代销者编号
	 */
	public static int GET_JC_DATA_RESOURCE_FLAG;

	@Value("#{system[agentNo]}")
	public  void setAGENT_NO(int agentNo) {
	    AGENT_NO = agentNo;
	}
	


	@Value("#{system[getJcDataResourceFlag]}")
	public  void setGET_JC_DATA_RESOURCE_FLAG(int flag) {
	    GET_JC_DATA_RESOURCE_FLAG = flag;
	}

}