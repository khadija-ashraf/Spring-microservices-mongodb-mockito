package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.controller, com.example.Service, com.example.repository")
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args); 
		System.out.println("Welcome to user world!");
	}

}
