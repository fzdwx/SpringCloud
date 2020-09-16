package com.lk.sc.fegin;

import com.lk.sc.entity.Payment;
import com.lk.sc.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author likeLove
 * @time 2020-09-01  18:56
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
@RequestMapping("/payment")
public interface PaymentFeignService {
    /**
     * 远程调用payment服务的getById方法
     * @param id 需要查询的payment对象
     * @return Result
     */
    @GetMapping("/get/{id}")
    public Result getById(@PathVariable String id);

    /**
     * 远程调用payment服务的save方法
     * @param payment 需要保存的payment对象
     * @return Result
     */
    @PostMapping("/save")
    public Result save(@RequestBody Payment payment);
}
