package com.techproed.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringbootDemoApplication.class, args);
		
		Laptop l1=con.getBean(Laptop.class); 
		Laptop l2=con.getBean(Laptop.class); 
	
		
		l1.turnOnLaptop();
		l2.turnOnLaptop();
			
	}

}
