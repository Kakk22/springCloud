package com.cyf.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@Component
public class MyLb implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 负载均衡算法： 接口访问的次数 % 服务器集群总数量 =实际调用的下标
     *
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int size = serviceInstances.size();
        int index = getAndIncrement() % size;
        return serviceInstances.get(index);
    }

    /**
     * 返回服务器坐标
     * @return
     */
    private final int getAndIncrement() {
        int current;
        int next;
        do {
            //当前值
            current = this.atomicInteger.get();
            //下一个值 判断是否越界
            next = current > Integer.MAX_VALUE ? 0 : current + 1;
            //CAS轻量锁，如果交换成功 退出while循环
        } while (!atomicInteger.compareAndSet(current,next));
        System.out.println("*********第几次访问，次数 next："+next);
            return next;
    }
}
