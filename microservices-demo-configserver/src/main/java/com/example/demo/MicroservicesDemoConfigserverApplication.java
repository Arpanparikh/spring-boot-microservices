package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesDemoConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemoConfigserverApplication.class, args);
	}

}
