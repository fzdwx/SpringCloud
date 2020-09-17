package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author likeLove
 * @time 2020-09-17  12:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacos9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacos9001.class, args);
    }
}
