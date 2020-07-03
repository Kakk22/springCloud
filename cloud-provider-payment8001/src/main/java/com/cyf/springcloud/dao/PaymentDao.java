package com.cyf.springcloud.dao;

import com.cyf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment get(@Param("id") Long id);
}
