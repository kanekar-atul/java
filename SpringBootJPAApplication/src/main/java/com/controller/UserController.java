package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class UserController {

	 
	
	@Value("${data}")
	private String data;
	
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/getUserList")
	public List<User> getUserList() {
		System.out.println(this.data);
		return userService.getUserList();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getUserById/{id}")
	public User getUserById(@PathVariable int id) {

		User user = null;
		try {
			user = userService.getUserById(id);
			System.out.println(user.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
		//return this.getUserList();
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteUser")
	public void deleteUser(@RequestBody User user){
		userService.delete(user);
		//return this.getUserList();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/findByCity/{city}")
	public List<User> findByCity(@PathVariable String city){
		return this.userService.findByCity(city);
	}

}
