package com.snkit.springbootsluethzipkindemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springbootsluethzipkindemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootsluethzipkindemo2Application.class, args);
	}
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
