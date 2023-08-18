package com.arm.spring.app;

import com.arm.spring.comp.Car;
import com.arm.spring.factory.CarFactory;

public class BusinessmanCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("luxory", "OD04BH0018");
		car.drive();

	}

}
