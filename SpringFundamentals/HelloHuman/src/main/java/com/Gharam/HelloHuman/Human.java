package com.Gharam.HelloHuman;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Human {
	@RequestMapping("/")
	public String Index() {
		return " Hello Human! Welcome To SpringBoot!";
	}
	@RequestMapping("/{name}")
	public String human(@PathVariable("name")String name) {
		return "Hello "+name+" Welcome To SpringBoot!";
	}
	
}
