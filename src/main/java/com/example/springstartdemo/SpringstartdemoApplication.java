package com.example.springstartdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("")
public class SpringstartdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstartdemoApplication.class, args);
	}

}
