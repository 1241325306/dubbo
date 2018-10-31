package com.mybubbo.bootorderserverconsumer.Controller;

import com.dubbo.interfaces.OrderService;
import com.dubbo.model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getorder",method = RequestMethod.GET)
    public List<UserAddress> getUserAddress(@RequestParam(name = "userId") String userId){
        System.out.println("getUserAddress ==========success01==========");
        return orderService.initOrder(userId);
    }
}
