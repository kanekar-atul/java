package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeStyle {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getId() + " " + user.getName());
		context.registerShutdownHook(); 
	}

}
