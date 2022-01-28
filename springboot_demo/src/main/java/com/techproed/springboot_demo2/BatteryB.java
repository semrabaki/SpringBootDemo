package com.techproed.springboot_demo2;

public class BatteryB implements BatteryI{

	
	BatteryB(){
		System.out.println("BatteryB is created....");
	}
	
	@Override
	public void use() {
		System.out.println("BatteryB is used...");
		
	}

}
