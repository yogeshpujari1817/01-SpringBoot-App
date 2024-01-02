package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaAppApplication {

	public static void main(String[] args) {
		
		private Map<String,object> cache = new HashMap<String,object>();
		
		ConfigurableApplicationContext run = SpringApplication.run(JavaAppApplication.class, args);
		
		int i =10;
		
		//changes for HIS-134
		run.close();
		
		//HIS-301 changes
		public void loadDataToCache(){
			//logic
		}
	}

	
}
