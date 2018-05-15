package com.xaq.springcloudzipkinservicemiya;

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
public class SpringcloudZipkinServiceMiyaApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringcloudZipkinServiceMiyaApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinServiceMiyaApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;
	@Bean
	public RestTemplate restTemplate() {
		return restTemplate;
	}
	@RequestMapping("/info")
	public String info(){
		log.info("info message");
		return "hi I'm miya";
	}

	@RequestMapping("/miya")
	public String miya(){
		log.info("miya");
		return restTemplate.getForObject("http://localhost:8988/info",String.class);
	}



}
