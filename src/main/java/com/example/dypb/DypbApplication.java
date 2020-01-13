package com.example.dypb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DypbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DypbApplication.class, args);
	}
	
	@GetMapping
	public String HelloWorld() {
		return "Hello World";
	}


}
