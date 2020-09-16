package com.lk.sc.fallback;

import com.lk.sc.feign.PaymentOpenFeign;
import org.springframework.stereotype.Component;

/**
 * @author likeLove
 * @time 2020-09-02  17:41
 */
@Component
public class PaymentOpenFeignFallback  implements PaymentOpenFeign {

    @Override
    public String ok(Integer id) {
        return "ok 的fallback";
    }

    @Override
    public String timeOut(Integer id) {
        return "timeOut 的fallback";
    }
}
