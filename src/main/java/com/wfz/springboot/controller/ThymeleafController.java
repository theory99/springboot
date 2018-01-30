package com.wfz.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	@RequestMapping("/hello")
	public String hello(Map<Object,String> map){
		map.put("msg", "Hello Thymeleaf");
		return "hello";
	}
	
	@RequestMapping("/hello1")
	public String hello1(){
		return "websocket";
	}
	
}
