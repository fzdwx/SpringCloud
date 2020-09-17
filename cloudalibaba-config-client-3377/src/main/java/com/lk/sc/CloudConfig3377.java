package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author likeLove
 * @time 2020-09-17  13:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConfig3377 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfig3377.class, args);
    }
}
