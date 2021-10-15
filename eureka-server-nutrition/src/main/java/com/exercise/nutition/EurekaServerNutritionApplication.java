package com.exercise.nutition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerNutritionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerNutritionApplication.class, args);
	}

}
