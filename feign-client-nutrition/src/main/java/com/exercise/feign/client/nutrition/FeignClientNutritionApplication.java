package com.exercise.feign.client.nutrition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientNutritionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientNutritionApplication.class, args);
	}

}
