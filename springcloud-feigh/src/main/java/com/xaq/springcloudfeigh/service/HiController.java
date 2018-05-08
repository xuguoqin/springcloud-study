package com.xaq.springcloudfeigh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nicker
 * @description
 * @date 2018/5/8 16:02
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String hi(String name){
        return schedualServiceHi.sayHiFromClient(name);
    }
}
