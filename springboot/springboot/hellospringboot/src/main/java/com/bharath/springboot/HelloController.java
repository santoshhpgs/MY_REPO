package com.bharath.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@RequestMapping("/hello")
	//@GetMapping("/hello")
	@PostMapping("/hello")
	public String hello() {
		return "Hello Spring Boot";
	}

}
