package com.greatdigitallab.springboot.demo.mydemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.greatdigitallab.springboot.demo.mydemoapp", 
							"org.greatdigitallab.springboot", 
							"edu.greatdigitallab.springboot"})
public class MydemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoappApplication.class, args);
	}
}