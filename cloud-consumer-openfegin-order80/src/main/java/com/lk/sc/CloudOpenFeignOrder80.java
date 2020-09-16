package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author likeLove
 * @time 2020-09-01  18:46
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class CloudOpenFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudOpenFeignOrder80.class, args);
    }
}
