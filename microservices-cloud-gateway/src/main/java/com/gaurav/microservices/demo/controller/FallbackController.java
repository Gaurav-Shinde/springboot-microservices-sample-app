package com.gaurav.microservices.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userFallback")
	public String userFallback() {
		return "User service took too long to respond. This is a fallback message.";
	}
	@GetMapping("/departmentFallback")
	public String departmentFallback() {
		return "Department service took too long to respond. This is a fallback message.";
	}
}
