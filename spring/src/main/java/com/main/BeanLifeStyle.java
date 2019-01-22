package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class BeanLifeStyle {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getId() + " " + user.getName());
		context.registerShutdownHook(); 
	}

}
