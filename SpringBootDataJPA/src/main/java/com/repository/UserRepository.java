package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
	List<User> findByName(String name);
	List<User> findByNameLike(String name);
	
}
