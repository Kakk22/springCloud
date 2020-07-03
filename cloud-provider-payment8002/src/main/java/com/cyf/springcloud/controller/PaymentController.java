package com.cyf.springcloud.controller;

import com.cyf.springcloud.entities.CommonResult;
import com.cyf.springcloud.entities.Payment;
import com.cyf.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/{id}")
    public CommonResult get(@PathVariable Long id){
        Payment payment = paymentService.get(id);
        if (payment!=null){
            return new CommonResult(200,"service:"+servicePort,payment);
        }else {
            log.error("查找失败：{}",id);
            return new CommonResult(400,"查找失败");
        }
    }

    @PostMapping("/create")
    public CommonResult create( @RequestBody Payment payment){
        int count = paymentService.create(payment);
        if (count > 0){
            return new CommonResult(200,"ok",payment);
        }else {
            log.error("创建失败：{}",payment);
            return new CommonResult(400,"创建失败");
        }
    }
}
