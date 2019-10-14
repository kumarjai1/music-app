package com.ga.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ga.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/hello") 
	public String hello() {
		return "Hello World!!!!!";
	}
	
}
