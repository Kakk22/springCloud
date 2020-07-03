package com.cyf.springcloud.service.impl;

import com.cyf.springcloud.dao.PaymentDao;
import com.cyf.springcloud.entities.Payment;
import com.cyf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment get(Long id) {
        return paymentDao.get(id);
    }
}
