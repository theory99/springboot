package com.wfz.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class IndexController {
	
	Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping
	public String index(){
		return "login";
	}
	
	
}
