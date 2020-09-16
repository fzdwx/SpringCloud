package com.lk.sc.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author likeLove
 * @time 2020-08-31  19:56
 */
@Component
public class MyLoadBalancer implements LoadBalancer {

    private  AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int curr;
        int next;
        do {
            curr = this.atomicInteger.get();
            next = curr >= Integer.MAX_VALUE ? 0 : curr + 1;
        } while (!this.atomicInteger.compareAndSet(curr, next));
        System.out.println("第几次访问，次数：" + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
