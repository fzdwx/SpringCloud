package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author likeLove
 * @time 2020-09-02  15:32
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class CloudPaymentHsytrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentHsytrix8001.class, args);
    }
}
