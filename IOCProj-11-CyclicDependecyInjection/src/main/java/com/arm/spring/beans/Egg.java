package com.arm.spring.beans;

public class Egg {
	private Hen hen;

	public Egg() {
		System.out.println("Egg class object got created by default constructor");
	}

	public void setHen(Hen hen) {
		this.hen = hen;
	}

	@Override
	public String toString() {
		return "Egg [hen=This hen give an egg]";
	}

}
