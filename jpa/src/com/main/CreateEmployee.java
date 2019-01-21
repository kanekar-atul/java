package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
 
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Jpa" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEid( 1203 );
	      employee.setEname( "Amit" );
	      employee.setSalary( 50000 );
	      employee.setDeg( "Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );

	}
}
