package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author likeLove
 * @time 2020-09-17  13:20
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CloudOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(CloudOrder83.class, args);
    }
}
