package com.lk.sc.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lk.sc.entity.Result;

/**
 * @author likeLove
 * @time 2020-09-19  18:14
 */
public class CustomerBlockHandler {

    public static Result byResource(BlockException e) {
        return Result.error().message(e.getClass().getCanonicalName() + "全局限流处理1");
    }
    public static Result byResource2(BlockException e) {
        return Result.error().message(e.getClass().getCanonicalName() + "全局限流处理2");
    }
}
