package com.lk.sc.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lk.sc.entity.Result;
import com.lk.sc.openfeign.PaymentFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author pdd20
 * @auther zzyy
 * @create 2020-02-23 15:01
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;

    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @Resource
    private PaymentFeign paymentFeign;

    @GetMapping("/consumer/payment/{id}")
    public Result getDataById(@PathVariable String id){
        return paymentFeign.getDataById(id);
    }


    //@SentinelResource("fallback")//什么都没有配置
    //@SentinelResource(value = "fallback",fallback = "handlerFallback")//什么都没有配置
    @SentinelResource(value = "fallback", blockHandler = "handlerBlock",exceptionsToIgnore = {IllegalArgumentException.class})//什么都没有配置
    @GetMapping(value = "/consumer/fallback/{id}")
    public Result fallback(@PathVariable long id) {
        Result res = restTemplate.getForObject(SERVICE_URL + "/" + id, Result.class, id);
        if (id == 4) {
            throw new IllegalArgumentException("非法参数异常");
        }
        return res;
    }

    //blockHandel sentinel服务降级
    public Result handlerBlock(@PathVariable long id,BlockException e) {
        return Result.error().message("没有您需要查找的id,block" + e.getMessage());
    }

    //fallback  java层面
    public Result handlerFallback(@PathVariable long id, Throwable throwable) {
        return Result.error().message("没有您需要查找的id,fallback" + throwable.getMessage());
    }

    /*@Value("${service-url.nacos-user-service}")
    private String serverURL;
    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
    }*/
}
