package com.cyf.springcloud.controller;

import com.cyf.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystixController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String ok(@PathVariable Integer id){
        log.info("*********ok"+id);
        return paymentService.ok(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
/*    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")  //3秒钟以内就是正常的业务逻辑
    })*/
    @HystrixCommand
    public String timeOut(@PathVariable Integer id){
        int i = 10/0;
        log.info("*********time"+id);
        return paymentService.timeOut(id);
    }



    //兜底方法
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费者80，对付支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,(┬＿┬)";
    }

    public String payment_Global_FallbackMethod(){
        return "Global fallback";
    }
}
