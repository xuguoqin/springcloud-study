package com.xaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nicker
 * @description
 * @date 2018/5/24 21:21
 */
@Api("测试的controller")
@RestController
public class TestController {

    @ApiOperation("hello")
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
