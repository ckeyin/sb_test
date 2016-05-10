// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.web
// File Name:CommonController.java
// Created Data:2016/5/10 8:11
// ======================================
package com.dev.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cky on 2016/5/10 8:11.
 */

@RestController
public class CommonController {

    @RequestMapping("test")
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","admin");
        map.put("sex","man");
        return map;
    }
}
