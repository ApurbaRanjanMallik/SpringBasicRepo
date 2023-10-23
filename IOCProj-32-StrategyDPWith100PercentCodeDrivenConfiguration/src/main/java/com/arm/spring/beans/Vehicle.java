package com.arm.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("engineType")
	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}

	public void journey(String from, String to) {
		String start = engine.start();
		System.out.println(start + " from " + from);
		System.out.println("Journey is going on happily ......");
		String stop = engine.stop();
		System.out.println(stop + " at " + to);
		System.out.println("We have reached at our destination. Thank you : )");

	}

}
