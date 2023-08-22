package com.sibiraj.rest.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day1 {
	
	@Value("${spring.properties.username}")
	public String name;
	
	@Value("${spring.properties.color}")
	public String color;
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}
	
	@GetMapping("/display")
	public String displayName()
	{
		return "Welcome "+name;
	}
	
	@GetMapping("/fav")
	public String displayColor()
	{
		return "My favorite color is "+color;
	}
}