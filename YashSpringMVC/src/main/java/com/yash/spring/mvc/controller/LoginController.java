package com.yash.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.spring.mvc.dto.Login;
import com.yash.spring.mvc.dto.User;
import com.yash.spring.mvc.service.UserService;

//import com.yash.spring.mvc.dto.Login;
//import com.yash.spring.mvc.dto.User;
//import com.yash.spring.mvc.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView("loginForm");
		return mv.addObject("login", new Login());

	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		User user = userService.validateUser(login.getUserName(), login.getPassword());
		if (null != user) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getFirstName());
		} else {
			mav = new ModelAndView("loginForm");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
}
