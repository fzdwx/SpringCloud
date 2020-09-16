package com.lk.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author likeLove
 * @time 2020-09-16  18:54
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344.class, args);
    }
}
