package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.HelloWorld;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.getMessage();
	}

}
