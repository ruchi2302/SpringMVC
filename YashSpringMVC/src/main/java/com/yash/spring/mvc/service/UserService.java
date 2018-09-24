package com.yash.spring.mvc.service;

import com.yash.spring.mvc.dto.User;

public interface UserService {

	public Integer register(User user);	
	public User validateUser(String userName, String password);

}
