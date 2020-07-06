package com.cyf.springcloud.controller;

import com.cyf.springcloud.service.paymentService;
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
public class OrderHystixController {

    @Autowired
    private paymentService paymentService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String ok(@PathVariable Integer id){
        log.info("*********ok"+id);
        return paymentService.ok(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeOut/{id}")
    public String timeOut(@PathVariable Integer id){
        log.info("*********time"+id);
        return paymentService.timeOut(id);
    }
}
