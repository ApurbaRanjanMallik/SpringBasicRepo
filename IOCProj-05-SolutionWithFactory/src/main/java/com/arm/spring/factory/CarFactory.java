package com.arm.spring.factory;

import com.arm.spring.comp.BudgetCar;
import com.arm.spring.comp.Car;
import com.arm.spring.comp.LuxoryCar;
import com.arm.spring.comp.SportsCar;

public class CarFactory {
	public static Car createCar(String type, String no) {
		if ("sports".equalsIgnoreCase(type)) {
			return new SportsCar(no);
		} else if ("budget".equalsIgnoreCase(type)) {
			return new BudgetCar(no);
		} else if ("luxory".equals(type)) {
			return new LuxoryCar(no);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
