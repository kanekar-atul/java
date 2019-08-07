package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.dao.EmployeeDao;
import com.main.model.Employee;

public class SpringJDBCTemplateMain {

	public static void main(String[] args) {

		 ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-Bean-Config.xml");  
	      
		    EmployeeDao dao=(EmployeeDao)ctx.getBean("emoDao");  
		    int status=dao.saveEmployee(new Employee("Rohit",35000));  
		    System.out.println(status);  
		     
		    dao.saveEmployeeByPreparedStatement(new Employee("Arman",7000)); 
		    List<Employee> empList = dao.getAllEmployees();
		    
		    System.out.println("\n");
		    
		    for(Employee l:empList){
		    	System.out.println(l.getId()+" "+l.getName()+" "+l.getSalary());
		    }
		    
		    System.out.println("\n");
		    
		    List<Employee> empListRwoMapper =dao.getAllEmployeesRowMapper();
		    for(Employee l:empListRwoMapper){
		    	System.out.println(l.getId()+" "+l.getName()+" "+l.getSalary());
		    }
		    
	}

}
