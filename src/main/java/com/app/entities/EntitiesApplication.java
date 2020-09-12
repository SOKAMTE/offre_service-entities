package com.app.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages = "com.app.entities")
public class EntitiesApplication {

	public static void main(String[] args) {
            SpringApplication.run(EntitiesApplication.class, args);
            System.out.println("**************************");
	}

}
