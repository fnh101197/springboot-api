package com.fajar.springbootapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class GeneralController {

	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
}
