package com.app.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.entities")
public class EntitiesApplication {

	public static void main(String[] args) {
            SpringApplication.run(EntitiesApplication.class, args);
            System.out.println("**************************");
	}

}
