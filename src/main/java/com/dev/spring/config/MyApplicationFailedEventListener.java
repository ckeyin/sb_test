// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.config
// File Name:MyApplicationFailedEventListener.java
// Created Data:2016/5/26 16:36
// ======================================
package com.dev.spring.config;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by cky on 2016/5/26 16:36.
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable throwable = event.getException();
        handleThrowable(throwable);
    }

    /*处理异常*/
    private void handleThrowable(Throwable throwable) {

    }
}
