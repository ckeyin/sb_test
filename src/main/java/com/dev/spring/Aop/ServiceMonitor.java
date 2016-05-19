// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring.Aop
// File Name:ServiceMonitor.java
// Created Data:2016/5/19 16:39
// ======================================
package com.dev.spring.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by cky on 2016/5/19 16:39.
 */
@Aspect
@Component
public class ServiceMonitor {

    @AfterReturning("execution(* com.dev..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }
}
