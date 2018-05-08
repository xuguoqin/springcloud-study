package com.xaq.springcloudfeigh.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author nicker
 * @description
 * @date 2018/5/8 15:59
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiImpl.class)
public interface SchedualServiceHi {
    @GetMapping(value = "hi")
    public String sayHiFromClient(@RequestParam(value = "name") String name);
}
