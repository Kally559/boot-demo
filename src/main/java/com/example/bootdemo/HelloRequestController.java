package com.example.bootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRequestController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring boot";
	}

}
