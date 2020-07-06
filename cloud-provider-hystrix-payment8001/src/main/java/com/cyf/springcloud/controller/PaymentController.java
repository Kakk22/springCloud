package com.cyf.springcloud.controller;

import com.cyf.springcloud.entities.CommonResult;
import com.cyf.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String ok(@PathVariable Integer id){
        log.info("*****result"+id);
         return paymentService.info_ok(id);
    }

    @GetMapping(value = "/payment/hystrix/timeOut/{id}")
    public String timeOut(@PathVariable Integer id){
        log.info("*****result"+id);
        return paymentService.timeOut(id);
    }
}
