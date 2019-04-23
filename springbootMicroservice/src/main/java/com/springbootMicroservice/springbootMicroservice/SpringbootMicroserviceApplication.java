package com.springbootMicroservice.springbootMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class SpringbootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceApplication.class, args);
		System.out.println("Started");

	}

}
