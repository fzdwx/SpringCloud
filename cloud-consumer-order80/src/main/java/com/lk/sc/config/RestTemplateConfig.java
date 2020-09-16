package com.lk.sc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author likeLove
 * @time 2020-08-31  11:44
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    //@LoadBalanced 去掉，使用自己定义的轮询算法
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
