package com.mybubbo.bootorderserverconsumer.serverImpl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.interfaces.OrderService;
import com.dubbo.interfaces.UserService;
import com.dubbo.model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServerImpl implements OrderService {

//    @Autowired
    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
