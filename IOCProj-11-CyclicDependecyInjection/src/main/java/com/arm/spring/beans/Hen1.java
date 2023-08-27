package com.arm.spring.beans;

public class Hen1 {
	private Egg1 egg1;

	public Hen1(Egg1 egg1) {
		super();
		this.egg1 = egg1;
	}

	@Override
	public String toString() {
		return "Hen1 [egg1=" + egg1 + "]";
	}
	
}
