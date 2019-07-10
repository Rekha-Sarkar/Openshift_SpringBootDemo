package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenShiftController {

	@GetMapping("/greetCustomer")
	public String greet()
	{
		return "Hello OpenShift";
	}
}
