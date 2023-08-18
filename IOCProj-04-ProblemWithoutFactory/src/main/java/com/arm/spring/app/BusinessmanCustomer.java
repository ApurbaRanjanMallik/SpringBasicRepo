package com.arm.spring.app;

import com.arm.spring.comp.Car;
import com.arm.spring.comp.LuxoryCar;

public class BusinessmanCustomer {

	public static void main(String[] args) {
		Car car = new LuxoryCar("OD04BH0018");
		car.drive();

	}

}
