// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring
// File Name:AppApplication.java
// Created Data:2016/5/6 11:10
// ======================================
package com.dev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cky on 2016/5/6 11:10.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
