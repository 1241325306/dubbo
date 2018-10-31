package com.mybubbo.bootorderserverconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo //开启dubbo注解
@SpringBootApplication
public class BootOrderServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServerConsumerApplication.class, args);
    }
}
