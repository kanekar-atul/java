package com.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainApp  implements CommandLineRunner,ApplicationListener<ApplicationEvent> {

	 @Value("${spring.application.name}")
	   private String name;
	
	public static void main(String[] args) { 
		System.out.println("First....");
		SpringApplication.run(MainApp.class, args); 
		System.out.println("Second....");
	}
	
	 @RequestMapping(value = "/")
	   public String name() {
	      return name;
	   }

	public void run(String... args) throws Exception { 
		System.out.println("CommandLineRunner....");
	}

	public void onApplicationEvent(ApplicationEvent event) { 
		System.out.println("ApplicationListener....");
	}

}
