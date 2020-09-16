package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author likeLove
 * @time 2020-09-16  19:25
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClient3355 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3355.class, args);
    }
}
