package com.homeAss.homeAss;

import com.homeAss.service.RestConssumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeAssApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeAssApplication.class, args);
	}

	@Autowired
	private RestConssumerService restConssumerService;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			restConssumerService.consumeRest();
		};
	}
}
