// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.web
// File Name:IndexContoller.java
// Created Data:2016/5/6 9:16
// ======================================
package com.dev.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cky on 2016/5/6 9:16.
 */
@RestController
@EnableAutoConfiguration
public class IndexContoller {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IndexContoller.class, args);
    }
}
