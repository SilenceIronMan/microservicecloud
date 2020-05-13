package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 20:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class DeptProvider8001Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001Hystrix_App.class, args);
    }
}
