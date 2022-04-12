package com.springrest.spring_rest_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringRestLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestLearningApplication.class, args);
	}

}
