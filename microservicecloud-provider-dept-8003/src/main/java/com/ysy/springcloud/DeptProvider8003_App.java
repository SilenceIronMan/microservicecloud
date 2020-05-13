package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 20:59
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
