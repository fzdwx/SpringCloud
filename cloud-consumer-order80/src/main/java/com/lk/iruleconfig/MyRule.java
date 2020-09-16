package com.lk.iruleconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author likeLove
 * @time 2020-08-31  18:44
 */
@Configuration
public class MyRule {
    /**
     * 定义为随机规则  new RandomRule()
     * @return
     */
    @Bean
    public IRule getIRule() {
        return new RandomRule();
    }
}
