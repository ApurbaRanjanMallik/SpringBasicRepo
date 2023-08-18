package com.arm.spring.app;

import com.arm.spring.comp.Car;
import com.arm.spring.factory.CarFactory;

public class YouthCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("sports", "AP01OD0001");
		car.drive();
	}

}
