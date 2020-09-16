package com.lk.sc.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author likeLove
 * @time 2020-09-01  19:43
 */
@Configuration
public class FeignConfig {

    //日志
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
