package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.User;

@RestController
public class UserController {

	@GetMapping("/alluser")
	public List<User> getAllUsers(){
		
		List<User> list = new ArrayList<User>();
		list.add(new User("1","Atul"));
		list.add(new User("2","Amit"));
		
		return list;
	}
}
