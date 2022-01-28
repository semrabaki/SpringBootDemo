package com.techproed.springboot_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	BatteryI b;
	@Autowired
	private BatteryA bA;
	
	Laptop(){
		System.out.println("LAptop is created....");
	}
	
	public void use() {
		bA.use();
	}
	
	public void turnOnLaptop() {
		System.out.println("Laptop is turned on...");
	}
	
	

}
