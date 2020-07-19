package com.lrh.consumer.controller;

import com.lrh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单服务controller
 */
@RestController
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("/init/{userId}")
    public String initOrder(@PathVariable String userId){
        orderService.initOrder(userId);
        return "success";
    }

}
