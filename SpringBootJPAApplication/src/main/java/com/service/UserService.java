package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	private  List<User> userList = new ArrayList<User>();

	public List<User> getUserList() {
		/*userList.add(new User(1, "Atul", "Mumbai"));
		userList.add(new User(2, "Amit", "M Road"));
		userList.add(new User(3, "john", "Orlando"));
		userList.add(new User(4, "Eric", "Kurla"));*/

		return (List<User>) this.userRepository.findAll();

	}

	public User getUserById(int id) {
		return this.userList.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addUser(User user) {

		this.userRepository.save(user);
	}

	public void delete(User user) { 
		 this.userList.removeIf(t ->t.getId() == user.getId());
	}

	public List<User> findByCity(String city){
		return this.userRepository.findByCity(city);
	}
}
