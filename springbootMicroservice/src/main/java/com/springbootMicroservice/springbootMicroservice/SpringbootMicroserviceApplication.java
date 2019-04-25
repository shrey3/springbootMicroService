package com.springbootMicroservice.springbootMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication(scanBasePackages={
"com.springbootMicroservice.springbootMicroservice.BooksRepository"})

public class SpringbootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceApplication.class, args);
		System.out.println("Started");

	}

}
