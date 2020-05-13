package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @anthor silenceYin
 * @date 2020/5/5 - 16:14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfigGit7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfigGit7001_App.class, args);
    }
}
