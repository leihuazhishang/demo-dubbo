package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author hanlu
 * @date 2019/7/9 10:49
 */
@Service(version = "1.0.0",timeout = 1000,interfaceClass = HelloService.class)
@Component//自动创建对象
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(){
        return "HelloWorld";
    }
}
