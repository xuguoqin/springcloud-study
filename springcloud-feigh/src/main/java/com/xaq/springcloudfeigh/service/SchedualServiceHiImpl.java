package com.xaq.springcloudfeigh.service;

import org.springframework.stereotype.Component;

/**
 * @author nicker
 * @description
 * @date 2018/5/8 16:30
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi{

    @Override
    public String sayHiFromClient(String name) {
        return "sorry feign";
    }
}
