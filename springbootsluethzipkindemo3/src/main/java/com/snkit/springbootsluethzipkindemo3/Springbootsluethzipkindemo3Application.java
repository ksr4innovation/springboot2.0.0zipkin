package com.snkit.springbootsluethzipkindemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springbootsluethzipkindemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootsluethzipkindemo3Application.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
