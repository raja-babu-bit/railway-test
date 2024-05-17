package com.exavalu.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuleToSpringTestingApplication {

	public static void main(String[] args) {
		System.out.println("Exavalu Mule Migration Enhancer server has been started...");
		SpringApplication.run(MuleToSpringTestingApplication.class, args);
	}

}
