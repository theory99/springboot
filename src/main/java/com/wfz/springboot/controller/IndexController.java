package com.wfz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class IndexController {

	@RequestMapping
	public String index(){
		return "login";
	}
	
	
}
