package com.main.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.ClassA;

public class SingletonScopeApp {

	public static void main(String[] args) { 
		
	  ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	  ClassA a = (ClassA) context.getBean("classA");
	  System.out.println(a.getName());
	  
	  a.setName("ClassA");
	  System.out.println(a.getName());
	  
	  
	  ClassA a1 = (ClassA) context.getBean("classA");
	  System.out.println(a1.getName());
	  
	  
	}

}
