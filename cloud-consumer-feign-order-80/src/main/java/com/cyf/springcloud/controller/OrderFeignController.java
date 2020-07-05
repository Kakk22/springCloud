package com.cyf.springcloud.controller;

import com.cyf.springcloud.entities.CommonResult;
import com.cyf.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/{id}")
    public CommonResult gePaymentById(@PathVariable Long id){
        return paymentFeignService.get(id);
    }
}
