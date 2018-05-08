package com.xaq.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClientApplication.class, args);
	}

	@RequestMapping("/hi")
	public String hi(@RequestParam String name){
		return "hi " + name;
	}
}
