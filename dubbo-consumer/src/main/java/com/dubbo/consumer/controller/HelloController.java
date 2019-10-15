package com.dubbo.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;


@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        String str = helloService.sayHello("TT");
        System.out.println("测试结果："+helloService.sayHello("zhangtao"));
        return str;
    }

}
