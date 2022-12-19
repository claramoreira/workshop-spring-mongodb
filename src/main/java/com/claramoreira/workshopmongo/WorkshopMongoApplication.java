package com.claramoreira.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.claramoreira.workshopmongo" })
public class WorkshopMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopMongoApplication.class, args);
	}
 
}
