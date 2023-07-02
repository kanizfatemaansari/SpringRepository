package com.example.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/helloworld")
	
	public String sayHelloWorld()
	{
		
		return "Hello world from Spring Boot";
	}
}