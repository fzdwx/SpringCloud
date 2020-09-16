package com.lk.sc.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author likeLove
 * @time 2020-08-31  19:55
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
