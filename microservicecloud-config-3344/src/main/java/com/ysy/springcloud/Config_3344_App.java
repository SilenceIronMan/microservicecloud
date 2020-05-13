package com.ysy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @anthor silenceYin
 * @date 2020/5/11 - 22:41
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_App.class,args);
    }
}
