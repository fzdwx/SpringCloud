package com.lk.sc.feign;

import com.lk.sc.fallback.PaymentOpenFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author likeLove
 * @time 2020-09-02  16:17
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = PaymentOpenFeignFallback.class)
public interface PaymentOpenFeign {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String ok(@PathVariable("id") Integer id);
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String timeOut(@PathVariable("id") Integer id);
}
