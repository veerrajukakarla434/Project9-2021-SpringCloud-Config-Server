package com.vkakarla.spring.cloud.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Project92021SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project92021SpringCloudConfigServerApplication.class, args);
	}

}
