package com.xaq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author nicker
 * @description
 * @date 2018/5/7 20:48
 */
@Service
public class HelloService {

    @Autowired
    public RestTemplate template;

    public String hiService(String name){
        return template.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
