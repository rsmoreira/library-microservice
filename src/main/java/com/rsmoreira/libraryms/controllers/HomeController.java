package com.rsmoreira.libraryms.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	protected Logger logger = Logger.getLogger(BookController.class.getName());
	
	@RequestMapping("/home/{name}")
    public String home(@PathVariable("name") String name){
        return "Hello " + name;
    }
	
}
