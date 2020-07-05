package com.cyf.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
public interface LoadBalancer {
    /**
    收集服务器总共有多少台能够提供服务的机器，并放到list里面
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
