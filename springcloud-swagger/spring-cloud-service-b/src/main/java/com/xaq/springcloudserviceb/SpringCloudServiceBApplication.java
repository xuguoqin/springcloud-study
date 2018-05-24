package com.xaq.springcloudserviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.xaq")
public class SpringCloudServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceBApplication.class, args);
	}

	@RestController
	class BbbController {

		@Autowired
		private DiscoveryClient discoveryClient;

		@GetMapping("/service-b")
		public String dc() {
			String service = "Services: " + discoveryClient.getServices();
			return service;
		}
	}
}
