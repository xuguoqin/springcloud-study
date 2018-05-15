package com.xaq.springcloudeurekaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaConfigServerApplication.class, args);
	}
}
