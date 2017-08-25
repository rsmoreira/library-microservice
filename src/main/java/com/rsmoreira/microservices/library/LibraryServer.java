package com.rsmoreira.microservices.library;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.rsmoreira.libraryms.configuration.LibraryConfiguration;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(LibraryConfiguration.class)
public class LibraryServer {

	protected Logger logger = Logger.getLogger(LibraryServer.class.getName());
	
//	@Autowired
//	BookRepository bookRepository;
//
//	@Autowired
//	PatronRepository patronRepository;
//
//	@Autowired
//	TransactionRepository transactionRepository;

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "library-server");
		SpringApplication.run(LibraryServer.class, args);
	}
}
