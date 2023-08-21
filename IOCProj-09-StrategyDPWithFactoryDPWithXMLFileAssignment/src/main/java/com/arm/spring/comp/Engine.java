package com.arm.spring.comp;

public interface Engine {
	public String fillFuel(double litre);
	default void fillGas(double kg) {
		System.out.println("Thank you for using CNG engine. CNG reduces harmful emissions thus reducing the effect of global warming.");
	}
		
	
}
