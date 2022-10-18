package com.gaurav.microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDepartmentServiceApplication.class, args);
	}

}
