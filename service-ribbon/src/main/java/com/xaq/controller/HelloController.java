package com.xaq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xaq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nicker
 * @description
 * @date 2018/5/7 20:51
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "hi")
    @HystrixCommand(fallbackMethod = "helloError")
    public String hi(String name){
        return helloService.hiService(name);
    }

    public String helloError(String name){
        return "服务异常";
    }
}
