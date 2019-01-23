package com.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean, DisposableBean {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("From SetName()....");
		this.name = name;
	}

	User() {
		System.out.println("Default Constructor..");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("From afterPropertiesSet().....");
	}

	public void destroy() throws Exception {
		System.out.println("From destroy().....");
	}

	public void initNew() {
		System.out.println("From initNew()....");
	}

	public void remove() {
		System.out.println("From remove()....");
	}

}
