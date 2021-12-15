package com.example.jbossdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JbossdemoApplication extends SpringBootServletInitializer {
	@Value("${name}")
	String name;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JbossdemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JbossdemoApplication.class, args);
	}


	@RestController
	class HelloController {
		@RequestMapping("/hello")
		@GetMapping
		String hello() {
			return "Hello  " + name;

		}
	}
}
