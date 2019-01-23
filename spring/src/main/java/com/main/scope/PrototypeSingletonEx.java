package com.main.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.ClassC;
import com.model.ClassD;

public class PrototypeSingletonEx {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ClassD d = new ClassD();
		d.setName("ClassD");

		ClassC c = (ClassC) context.getBean("classC");
		c.setName("ClassC");
		c.setD(d);
		
		System.out.println(c.getName()+" "+c.getD().getName());
		
		ClassC c1 = (ClassC) context.getBean("classC");
		System.out.println(c1.getName()+" "+c1.getD().getName());
	}

}
