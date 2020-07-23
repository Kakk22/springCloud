package com.cyf.springcloud.controller;

import com.cyf.springcloud.domain.CommonResult;
import com.cyf.springcloud.domain.Order;
import com.cyf.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author by cyf
 * @date 2020/7/23.
 */
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
