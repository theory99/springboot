package com.wfz.springboot.dao;

import com.wfz.springboot.pojo.User;

public interface UserDao {

	public int insert(User user);
	
	public int deleteById(Integer id);
	
	public int update(User user);
	
	public User getById(Integer id);
}
