package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;

public class FindEmployee {

	public static void main(String[] args) {
		
		 EntityManagerFactory factory =  Persistence.createEntityManagerFactory("Jpa");
		 EntityManager manager =  factory.createEntityManager();
		 manager.getTransaction().begin();
		 
		 Employee emp = (Employee) manager.find(Employee.class, 1201);
		 
		 System.out.println(emp.getEid());
		 System.out.println(emp.getEname());
		 System.out.println(emp.getDeg());
		 System.out.println(emp.getSalary());
		 
		 
	}
}
