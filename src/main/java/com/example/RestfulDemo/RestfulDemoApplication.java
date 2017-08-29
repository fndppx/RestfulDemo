package com.example.RestfulDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.*;


@Controller
@EnableAutoConfiguration
public class RestfulDemoApplication {
	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(RestfulDemoApplication.class, args);
	}
}
