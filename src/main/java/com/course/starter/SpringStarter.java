package com.course.starter;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarter {
	
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SpringStarter.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        app.run(args);
	}

}
