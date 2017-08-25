package com.rsmoreira.microservices.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Class responsible to run Eureka registration server.
 * 
 * @author Rafael Moreira 
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {

	/**
	 * Run the application using Spring Boot
	 * @param args
	 */
	public static void main(String[] args) {
		/* By default Spring Boot look for an application.properties
		 * setting this Property bellow, Spring Boot will loof for 
		 * a properties file named registration-server.yml (or 
		 * registration-server.properties)
		 */
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(RegistrationServer.class, args);
	}
}
