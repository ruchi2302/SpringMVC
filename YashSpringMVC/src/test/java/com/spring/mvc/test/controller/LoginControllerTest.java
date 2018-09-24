package com.spring.mvc.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.web.servlet.ModelAndView;

import com.yash.spring.mvc.controller.LoginController;
import com.yash.spring.mvc.service.UserService;

public class LoginControllerTest {

	@InjectMocks
	LoginController loginController;

	@Mock
	UserService userService;

	@Mock
	HttpServletResponse response;

	@Test
	public void shouldDisplayLogin() {

		ModelAndView modelAndView = loginController.showLogin();

		Assert.assertNotNull(modelAndView);
		

	}

}
