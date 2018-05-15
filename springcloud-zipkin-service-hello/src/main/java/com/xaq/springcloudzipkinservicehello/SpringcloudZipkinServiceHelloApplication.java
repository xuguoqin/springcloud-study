package com.xaq.springcloudzipkinservicehello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringcloudZipkinServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinServiceHelloApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@RequestMapping("/hello")
	public String hello(){
		return restTemplate.getForObject("http://localhost:8988/info",String.class);
	}
}
