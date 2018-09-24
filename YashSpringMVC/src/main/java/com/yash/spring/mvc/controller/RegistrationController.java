package com.yash.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.spring.mvc.dto.User;
import com.yash.spring.mvc.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	UserService userService;

	String msg = "Choose any Option....";

	@RequestMapping("/home")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("msg", msg);
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mv = new ModelAndView("registerForm");
		return mv.addObject("user", new User());

	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		{
			userService.register(user);
			return new ModelAndView("welcome", "firstName", user.getFirstName());

		}
	}
}
