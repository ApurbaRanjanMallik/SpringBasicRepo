package com.arm.spring.app;

import com.arm.spring.comp.BudgetCar;
import com.arm.spring.comp.Car;

public class ProfessionalCustomer {

	public static void main(String[] args) {
		Car car = new BudgetCar("TS09HB0007");
		car.drive();
	}
}
