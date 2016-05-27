// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.config
// File Name:MyApplicationPreparedEventListener.java
// Created Data:2016/5/26 16:34
// ======================================
package com.dev.spring.config;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cky on 2016/5/26 16:34.
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        ConfigurableApplicationContext cac = event.getApplicationContext();
        passContextInfo(cac);
    }

    /**
     * 传递上下文
     *
     * @param cac
     */
    private void passContextInfo(ApplicationContext cac) {
        //dosomething()
    }
}
