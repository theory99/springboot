package com.wfz.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

	@GetMapping("/helloWorld")
	public String helloworld(){
		return "helloworld";
	}
}
