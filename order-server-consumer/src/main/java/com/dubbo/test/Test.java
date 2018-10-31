package com.dubbo.test;

import com.dubbo.model.UserAddress;
import com.dubbo.serverImpl.OrderServerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderServerImpl bean = context.getBean(OrderServerImpl.class);

        List<UserAddress> userAddress = bean.initOrder("1");
        for(UserAddress u: userAddress){
            System.out.println(u.getUserAddress());
        }
        System.out.println("调用完成。。。。。。。");
        System.in.read();
    }

}
