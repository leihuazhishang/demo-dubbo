package com.dubbo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hanlu
 * @date 2019/7/9 11:06
 */
@Controller
public class HelloController {

    @Reference(interfaceClass =HelloService.class,version = "1.0.0",check = false)

    private HelloService helloService;


    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
      return   helloService.sayHello();
    }
}
