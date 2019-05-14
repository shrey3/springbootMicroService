package com.springbootMicroservice.springbootMicroservice;


//import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class}, scanBasePackages={
		"com.springbootMicroservice.springbootMicroservice.UserRepository"})
@ComponentScan({"com.springbootMicroservice.springbootMicroservice"})
@EnableJpaRepositories("com.springbootMicroservice.springbootMicroservice")
public class SpringbootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceApplication.class, args);
		System.out.println("Started");
//		File jarDir = new File(ClassLoader.getSystemClassLoader().getResource(".").getPath());
//		System.out.println(jarDir.getAbsolutePath());

	}
}
