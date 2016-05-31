// ======================================
// Project Name:sb_test
// Package Name:com.dev.spring
// File Name:AppApplication.java
// Created Data:2016/5/6 11:10
// ======================================
package com.dev.spring;

import com.dev.spring.config.MyApplicationEnvironmentPreparedEventListener;
import com.dev.spring.config.MyApplicationFailedEventListener;
import com.dev.spring.config.MyApplicationPreparedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by cky on 2016/5/6 11:10.
 */
@SpringBootApplication
public class AppApplication {

    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return (ConfigurableEmbeddedServletContainer container) -> {
            container.setDocumentRoot(new File("/jsp"));
        };
    }

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(AppApplication.class);
        application.addListeners(new MyApplicationEnvironmentPreparedEventListener(), new
                MyApplicationPreparedEventListener(), new MyApplicationFailedEventListener());
        application.run(args);
    }

}
