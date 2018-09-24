package com.yash.spring.mvc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.spring.mvc.dao.UserDao;
import com.yash.spring.mvc.dto.User;
import com.yash.spring.mvc.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Transactional
	public Integer register(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User validateUser(String userName, String password) {

		return userDao.validateUser(userName, password);
	}
}
