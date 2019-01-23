package com.main.beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorModel2 implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println(" BeanPostProcessorModel2 BeforeInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println(" BeanPostProcessorModel2 AfterInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

}