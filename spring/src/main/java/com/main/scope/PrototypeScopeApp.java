package com.main.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.ClassB;

public class PrototypeScopeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClassB b = (ClassB) context.getBean("classB");

		System.out.println(b.getName());
		b.setName("ClassB");

		System.out.println(b.getName());

		ClassB b1 = (ClassB) context.getBean("classB");

		System.out.println(b1.getName()); 
	}

}
