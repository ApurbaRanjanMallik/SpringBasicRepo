package com.arm.spring.beans;

public class Hen {
	private Egg egg;

	public Hen() {
		System.out.println("Hen class object got created by default constructor");
	}

	public void setEgg(Egg egg) {
		this.egg = egg;
	}

	@Override
	public String toString() {
		return "Hen [egg= This egg give an hen]";
	}

}
