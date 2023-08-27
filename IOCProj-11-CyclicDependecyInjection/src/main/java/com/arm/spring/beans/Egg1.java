package com.arm.spring.beans;

public class Egg1 {
	private Hen1 hen1;

	public Egg1(Hen1 hen1) {
		super();
		this.hen1 = hen1;
	}

	@Override
	public String toString() {
		return "Egg1 [hen1=" + hen1 + "]";
	}

}
