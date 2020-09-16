package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author likeLove
 * @time 2020-08-30  10:52
 */
@SpringBootApplication
@ComponentScan("com.lk.sc.*")
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudPayment8001.class,args);
    }
}
