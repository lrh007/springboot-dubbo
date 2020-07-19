package com.lrh.consumer.service;

import com.lrh.bean.UserAddress;
import com.lrh.service.OrderService;
import com.lrh.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单服务实现类
 */
@Service
public class OrderServiceImpl implements OrderService {

    @DubboReference(version = "2.0.0") //引用服务
    UserService userService;
    /**
     * 初始化订单
     * @param userId
     */
    @Override
    public void initOrder(String userId) {
        //1查询用户收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
