package com.cyf.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author by cyf
 * @date 2020/7/13.
 */
@Service
public class PaymentFallbackService implements  PaymentService {
    @Override
    public String ok(Integer id) {
        return "PaymentFallbackService----fallback-ok";
    }

    @Override
    public String timeOut(Integer id) {
        return "PaymentFallbackService----fallback-timeOut";
    }
}
