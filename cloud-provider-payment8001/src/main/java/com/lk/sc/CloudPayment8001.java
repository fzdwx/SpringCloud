package com.lk.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author likeLove
 * @time 2020-08-30  10:52
 */
@SpringBootApplication
@ComponentScan("com.lk.sc.*")
public class CloudPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudPayment8001.class,args);
    }
}
