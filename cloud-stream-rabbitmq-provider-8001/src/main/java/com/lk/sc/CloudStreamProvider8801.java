package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author likeLove
 * @time 2020-09-17  11:23
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudStreamProvider8801 {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamProvider8801.class, args);
    }
}
