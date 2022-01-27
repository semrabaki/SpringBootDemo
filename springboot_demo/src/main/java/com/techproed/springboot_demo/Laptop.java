package com.techproed.springboot_demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private Battery b;
	private int price;
	
	Laptop(){
		System.out.println("Laptop is created....");
	}
	
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void turnOnLaptop() {
		System.out.println("Laptop is turned on....");
	}

}
