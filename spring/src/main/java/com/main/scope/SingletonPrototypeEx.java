package com.main.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.Persone;

public class SingletonPrototypeEx {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Address a = new Address();
		a.setId(1);
		a.setCity("Mumbai");
		a.setPincode("123456");

		Persone p = (Persone) context.getBean("persone");
		p.setId(1);
		p.setName("Amit");
		p.setAddress(a);

		System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress().getId() + " " + p.getAddress().getCity()
				+ " " + p.getAddress().getPincode());

		Persone p1 = (Persone) context.getBean("persone");
		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getAddress().getId() + " "
				+ p1.getAddress().getCity() + " " + p1.getAddress().getPincode());

	}

}
