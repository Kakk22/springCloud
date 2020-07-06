package com.cyf.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author by cyf
 * @date 2020/7/5.
 */
@Service
public class PaymentService {

    public String info_ok(Integer id){
        return "线程池"+Thread.currentThread().getName()+"/t"+"paymentInfo_ok,id:"+id;
    }

    public String timeOut(Integer id){
        Long time = 3000L;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"/t"+"paymentInfo_timeOut,id:"+id;
    }
}
