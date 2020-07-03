package com.cyf.springcloud.controller;

import com.cyf.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@RestController
public class OrderController {
    public static final String URL = "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/{id}")
    public CommonResult get(@PathVariable Long id){
        return restTemplate.getForObject(URL+"/payment/"+id,CommonResult.class);
    }
}
