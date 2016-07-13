package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;

public class UserController {
	
	 //@Qualifier("UserServiceImpl2")
	 @Autowired
	 @Qualifier("UserServiceImpl2")
	 private UserService userService;
	
	
	 public void createUser(User user){
		 userService.save(user);
		 // call UserService here
		 userService.displayList();
	 }
}