package com.spring.mvc.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.yash.spring.mvc.controller.RegistrationController;
import com.yash.spring.mvc.dto.User;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationControllerTest {

	@Mock
	HttpServletRequest request;

	@Mock
	HttpServletResponse response;

	@InjectMocks
	RegistrationController registrationController;

	@Mock
	User user;

	@Test
	public void shouldshowHomeMethodReturnHomePage() {
		ModelAndView modelAndView = registrationController.showHome();
		Assert.assertNotNull(modelAndView);
		Assert.assertEquals("home", modelAndView.getViewName());
		Assert.assertEquals("Choose any Option....", modelAndView.getModel().get("msg"));
	}

}
