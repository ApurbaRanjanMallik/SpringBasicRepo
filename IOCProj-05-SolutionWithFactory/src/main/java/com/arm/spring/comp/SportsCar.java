package com.arm.spring.comp;

public class SportsCar extends Car{

	String no;

	public SportsCar(String no) {
		super();
		this.no = no;
	}

	@Override
	public void drive() {
		System.out.println("Driving Sports car of Number : " + no);
	}
}
