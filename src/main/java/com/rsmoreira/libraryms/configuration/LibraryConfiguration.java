package com.rsmoreira.libraryms.configuration;

import java.util.logging.Logger;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.rsmoreira.libraryms")
@EnableJpaRepositories("com.rsmoreira.libraryms")
@ComponentScan("com.rsmoreira.libraryms")
public class LibraryConfiguration {

	protected Logger logger;

	public LibraryConfiguration() {
		logger = Logger.getLogger(getClass().getName());
	}
}
