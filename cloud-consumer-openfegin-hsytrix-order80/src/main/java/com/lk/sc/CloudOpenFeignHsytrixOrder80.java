package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author likeLove
 * @time 2020-09-02  16:15
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableHystrix
public class CloudOpenFeignHsytrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudOpenFeignHsytrixOrder80.class, args);
    }
}
