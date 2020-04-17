package com.raj.springweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloWorldController {
	
	
	@RequestMapping (value="/helloapi/helloworld", method=RequestMethod.GET)
	public String helloworld () {
		return new String("Hello World");
	}

}
