package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;


@Service 
@CacheConfig()
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	@Cacheable("users")	 
	public List<User>  getUserAllList() { 
		System.out.println("Inside the service layer");
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
