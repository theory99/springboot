package com.wfz.springboot.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wfz.springboot.pojo.User;

@Controller
@RequestMapping("/fastjson")
public class FastJsonController {
	
	@RequestMapping("/test")
	@ResponseBody
	public User test(){
		User user = new User();
		user.setId(1);
		user.setUsername("wfz");
		user.setPassword("wfz123456");
		user.setBirthday(new Date());
		return user;
	}
}
