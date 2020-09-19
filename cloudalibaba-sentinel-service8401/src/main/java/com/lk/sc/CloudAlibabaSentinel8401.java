package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author likeLove
 * @time 2020-09-19  9:07
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CloudAlibabaSentinel8401 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSentinel8401.class, args);
    }
}

