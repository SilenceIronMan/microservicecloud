package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 22:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }
}
