package com.appcatapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppCatApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCatApiApplication.class, args);
	}

}
