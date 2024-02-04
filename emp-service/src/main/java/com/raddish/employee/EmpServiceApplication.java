package com.raddish.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class EmpServiceApplication {
	
	@GetMapping
	public String getWelcomePage() {
		return "Welcome to employee service ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceApplication.class, args);
	}

}
