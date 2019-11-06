// Copyright (C) 2012-2017 UUZZ All rights reserved
package test.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 类 名: SpringUtil<br/>
 * 描 述: <br/>
 * 作 者: Wang Tianyi<br/>
 * 创 建： 2017年1月22日<br/>
 *
 * 历 史: (版本) 作者 时间 注释 <br/>
 */
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
	return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext)
	    throws BeansException {
	SpringUtil.applicationContext = applicationContext;
    }
}
