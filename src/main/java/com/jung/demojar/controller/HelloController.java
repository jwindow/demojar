package com.jung.demojar.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello(){
		return "Hello from Hello Controller demojar.<br> Time is "+LocalDateTime.now();
	}
}
