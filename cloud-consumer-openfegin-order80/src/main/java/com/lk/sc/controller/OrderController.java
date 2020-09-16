package com.lk.sc.controller;

import com.lk.sc.entity.Payment;
import com.lk.sc.entity.Result;
import com.lk.sc.fegin.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author likeLove
 * @time 2020-09-01  18:57
 */
@RequestMapping("/consumer")
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/get/{id}")
    public Result getById(@PathVariable String id){
        return paymentFeignService.getById(id);
    }

    /**
     * 远程调用payment服务的save方法
     *
     * @param payment 需要保存的payment对象
     * @return Result
     */
    @PostMapping("/save")
    public Result save(@RequestBody Payment payment){
        return paymentFeignService.save(payment);
    }
}
