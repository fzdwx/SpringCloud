package com.lk.sc.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lk.sc.entity.Payment;
import com.lk.sc.entity.Result;
import com.lk.sc.handler.CustomerBlockHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author likeLove
 * @time 2020-09-19  9:10
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/byresource")
    @SentinelResource(value = "byresource",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "byResource")
    public Result byResource() {
        return  Result.ok().message("按资源名称限流测试ok").data("payment",new Payment(1L,"like"));
    }

    public Result handleException(BlockException e) {
        return Result.error().message(e.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/testa")
    public String testA() {
        return "testA";
    }
    @GetMapping("/testb")
    public String testb() {
        return "testb";
    }

    @GetMapping("/testd")
    public String testd() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testd 测试rt");
        return "testd";
    }

    @GetMapping("/testhot")
    @SentinelResource(value = "testhot",blockHandler = "bk_testhot")
    public String testhot(String a1) {

        return "testhot";
    }

    public String bk_testhot(String a1,BlockException e) {
        return "bk_testhot";
    }
}
