package com.lk.sc.openfeign;

import com.lk.sc.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author likeLove
 * @time 2020-09-19  19:40
 */
@FeignClient(value = "nacos-payment-provider")
public interface PaymentFeign {

    @GetMapping("/{id}")
    public   Result getDataById(@PathVariable String id);
}
