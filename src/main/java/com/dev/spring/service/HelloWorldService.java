// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.service
// File Name:HelloWorldService.java
// Created Data:2016/5/6 15:33
// ======================================
package com.dev.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cky on 2016/5/6 15:33.
 */
@Component
public class HelloWorldService {

    @Value("${name}")
    private String name;

    public String getHelloMessage() {
        return " Hello " + this.name;
    }

}
