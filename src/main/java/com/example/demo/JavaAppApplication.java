package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaAppApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(JavaAppApplication.class, args);
		
		it i =10;
		
		//changes for HIS-134
		run.close();
	}

	
}
