package com.main.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/val/{id}")
	public ArrayList getValue(@PathVariable String id) {
		ArrayList l = new ArrayList();
		l.add(id);
		return l;
	}
	
}
