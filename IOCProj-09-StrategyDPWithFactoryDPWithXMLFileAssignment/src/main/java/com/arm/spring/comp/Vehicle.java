package com.arm.spring.comp;

public class Vehicle {
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String travel(String place, double litre) {
		System.out.println("Vehicle is going to " + place);
		System.out.println("Alert : Your vehicle fuel is less than 40%.\nPlease fill fuel at nearest fuel station");
		String msg = engine.fillFuel(litre);
		return msg + "\nHappy journey : )";
	}
}
