package com.arm.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arm.spring.beans.Vehicle;
import com.arm.spring.config.AppConfig;

/**
 * Hello world!
 *
 */
public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		vehicle.journey("Hyderabad", "Bhadrak");
		context.close();
	}
}
