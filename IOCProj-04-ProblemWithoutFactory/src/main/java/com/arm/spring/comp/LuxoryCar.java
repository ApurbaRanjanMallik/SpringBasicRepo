package com.arm.spring.comp;

public class LuxoryCar extends Car {
	private String no;

	public LuxoryCar(String no) {
		super();
		this.no = no;
	}

	@Override
	public void drive() {
		System.out.println("Driving Luxory car of Number : "+no);
	}

}
