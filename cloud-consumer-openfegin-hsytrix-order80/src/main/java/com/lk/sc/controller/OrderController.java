package com.lk.sc.controller;

import com.lk.sc.feign.PaymentOpenFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author likeLove
 * @time 2020-09-02  16:20
 */
@RestController
@Slf4j
@RequestMapping("/order")
//@DefaultProperties(defaultFallback = "globalFallback")
public class OrderController {

    @Resource
    private PaymentOpenFeign paymentOpenFeign;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String ok(@PathVariable("id") Integer id) {
        return paymentOpenFeign.ok(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
   /* @HystrixCommand(fallbackMethod = "timeOutHandle", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    /*@HystrixCommand*/
    public String timeOut(@PathVariable("id") Integer id) {
        int time = 3;
        //int age = 10/0;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentOpenFeign.timeOut(id);
    }

    public String timeOutHandle(Integer id) {
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
    //全局fallback方法
    public String globalFallback() {
        return "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
    }
}
