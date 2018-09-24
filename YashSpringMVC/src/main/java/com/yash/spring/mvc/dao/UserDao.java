package com.yash.spring.mvc.dao;

import com.yash.spring.mvc.dto.User;

public interface UserDao {

	public Integer addUser(User user);

	public User validateUser(String userName,String password);

}
