package com.lk.sc.openfeign;

import com.lk.sc.entity.Result;
import org.springframework.stereotype.Component;

/**
 * @author likeLove
 * @time 2020-09-19  19:44
 */
@Component
public class HandlerFeign implements PaymentFeign {

    @Override
    public Result getDataById(String id) {
        return Result.error().message("HandlerFeign兜底");
    }
}
