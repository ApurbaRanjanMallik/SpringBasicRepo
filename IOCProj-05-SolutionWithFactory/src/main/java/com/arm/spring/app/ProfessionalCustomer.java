package com.arm.spring.app;

import com.arm.spring.comp.Car;
import com.arm.spring.factory.CarFactory;

public class ProfessionalCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("budget", "TS09HB0007");
		car.drive();
	}
}
