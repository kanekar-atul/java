package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	
	@RequestMapping(method=RequestMethod.GET,value="/test")
	public void getTest() { 
		System.out.println("TEST");
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name) { 
		return this.userService.getUserByName(name);
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/getUserByNameLike/{name}")
	public List<User> getUserByNameLike(@PathVariable String name) { 
		return this.userService.getUserByNameLike(name+"%");
	}
	
	
	
	//@GetMapping(value="/getAllUsers")
	@RequestMapping(method=RequestMethod.GET,value="/getAllUsers")
	public List<User> getUserAllList() {
      return this.userService.getUserAllList();
	}
	
	//@PostMapping(value="/addUser")
	@RequestMapping(method=RequestMethod.POST,value="/addUser")
	public void addUser(@RequestBody User user) {
		System.out.println("TEST......");
        this.userService.addUser(user);
	}
	
	
	
	
}
