package com.cyf.springcloud.service;

import com.cyf.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/{id}")
    CommonResult get(@PathVariable("id") Long id);
}
