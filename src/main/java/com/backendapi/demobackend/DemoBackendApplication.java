package com.backendapi.demobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendApplication.class, args);
	}


	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/is-alive")
	public String isAlive() {
		return "Yes";
	}



}
