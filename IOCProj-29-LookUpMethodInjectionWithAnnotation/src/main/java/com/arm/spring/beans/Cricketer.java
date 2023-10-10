package com.arm.spring.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Cricketer {

	@Lookup
	public abstract Bat createBat();

	/*The above method will be implement in the 
	 *InMemory proxy class which is the sub class
	 *of this abstract class and it contains the 
	 *lookup logic
	 * */
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}

	public void bowling() {
		System.out.println("Cricketer.bowling()");
	}

	public void battting() {
		System.out.println("Cricketer.battting()");
		// Get dependent class object by calling the above abstract method
		Bat bat = createBat();
		int runs = bat.scoreRuns();
		System.out.println("Batsman did score : " + runs);
	}

	public void fielding() {
		System.out.println("Cricketer.fielding()");
	}

	public void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}

}
