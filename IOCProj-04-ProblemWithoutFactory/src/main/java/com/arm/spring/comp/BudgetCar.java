package com.arm.spring.comp;

public class BudgetCar extends Car {

	String no;

	public BudgetCar(String no) {
		super();
		this.no = no;
	}

	@Override
	public void drive() {
		System.out.println("Driving Budget car of Number : " + no);
	}

}
