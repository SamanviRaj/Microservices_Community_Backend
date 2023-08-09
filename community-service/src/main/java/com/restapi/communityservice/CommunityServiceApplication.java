package com.restapi.communityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableFeignClients
@SpringBootApplication
@CrossOrigin
public class CommunityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityServiceApplication.class, args);
	}

}
