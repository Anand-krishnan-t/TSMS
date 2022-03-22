package com.stgit.tsms.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TsmsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsmsAdminApplication.class, args);
	}

}
