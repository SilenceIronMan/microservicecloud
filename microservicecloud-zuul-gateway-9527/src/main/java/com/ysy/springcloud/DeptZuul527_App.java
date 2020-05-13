package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 22:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class DeptZuul527_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptZuul527_App.class, args);
    }
}
