package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User>  getUserAllList() { 
		return this.userRepository.findAll();
	}
 

	public void addUser(User user) { 
		this.userRepository.save(user);
	}


	public List<User> getUserByName(String name) { 
		return this.userRepository.findByName(name);
	}


	public List<User> getUserByNameLike(String name) {		
		return this.userRepository.findByNameLike(name);
	}

}
