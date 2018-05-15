package com.xaq.springcloudzipkinservicehi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringcloudZipkinServiceHiApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringcloudZipkinServiceHiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinServiceHiApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@RequestMapping(value = "/hi")
	public String callHome(){
		logger.info("call trace  service-hi");
		String string = restTemplate.getForObject("http://localhost:8999/hello", String.class);
		return string;
	}

	@RequestMapping("/info")
	public String info(){
		logger.info("calling trace service-hi");
		return "I'm service-hi";
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
}
