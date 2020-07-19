package com.lrh.provider.service;


import com.lrh.bean.UserAddress;
import com.lrh.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * 用户服务实现类
 */
@DubboService(version = "2.0.0") //对外暴露服务
public class UserServiceImpl02 implements UserService {
    /**
     * 通过用户id返回所有的地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("新版本 2.0.0");
        UserAddress userAddress1 = new UserAddress(1,"北京市昌平区鸿福科技园","1","tomcat","15704120980",true);
        UserAddress userAddress2 = new UserAddress(2,"深圳市安兴区硅谷大厦","2","apache","188979239871",true);
        return Arrays.asList(userAddress1,userAddress2);
    }
}
