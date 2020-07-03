package com.cyf.springcloud.service;

import com.cyf.springcloud.entities.Payment;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
public interface PaymentService {
    int create(Payment payment);
    Payment get(Long id);
}
