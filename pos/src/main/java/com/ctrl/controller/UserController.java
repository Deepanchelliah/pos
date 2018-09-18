package com.ctrl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.ctrl.domains.User;
import com.ctrl.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public List<User> addUser(User user){
		return userService.findAllUsers();
	}
	
}
