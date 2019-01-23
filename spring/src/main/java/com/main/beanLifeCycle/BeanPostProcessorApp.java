package com.main.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		HelloWorld h = (HelloWorld) context.getBean("helloworldPostProcessorModel");

		h.getMessage();
	}

}
