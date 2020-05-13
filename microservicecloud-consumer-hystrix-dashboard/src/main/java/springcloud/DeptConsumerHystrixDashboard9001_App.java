package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 22:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard9001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard9001_App.class, args);
    }
}
