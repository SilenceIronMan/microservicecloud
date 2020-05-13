package com.ysy.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @anthor silenceYin
 * @date 2020/5/4 - 21:39
 */
@Configuration
public class ConfigBeans {

    @Bean
    @LoadBalanced
    public  RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return  new RetryRule();
    }
}
