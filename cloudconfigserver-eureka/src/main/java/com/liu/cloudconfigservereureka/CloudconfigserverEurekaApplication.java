package com.liu.cloudconfigservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudconfigserverEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigserverEurekaApplication.class, args);
	}

}
