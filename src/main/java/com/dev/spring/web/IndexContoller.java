// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.web
// File Name:IndexContoller.java
// Created Data:2016/5/6 9:16
// ======================================
package com.dev.spring.web;

import com.dev.spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by cky on 2016/5/6 9:16.
 */
@Controller
public class IndexContoller {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    String home(Map<String, Object> model) {
        System.out.println(helloWorldService.getHelloMessage());
        model.put("time", new Date());
        model.put("message", helloWorldService.getMessage());
        return "welcome";
    }

}
