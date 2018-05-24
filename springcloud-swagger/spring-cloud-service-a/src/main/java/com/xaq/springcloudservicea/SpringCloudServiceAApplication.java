package com.xaq.springcloudservicea;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api("启动类")
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.xaq")
public class SpringCloudServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceAApplication.class, args);
	}

	@RestController
	class AaaController {

		@Autowired
		DiscoveryClient discoveryClient;

		@ApiOperation(value = "获取接口说明")
		@GetMapping("/service-a")
		public String dc() {
			String services = "Services: " + discoveryClient.getServices();
			System.out.println(services);
			return services;
		}
	}

}
