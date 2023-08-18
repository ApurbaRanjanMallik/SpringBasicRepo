package com.arm.component;

public class Test2 {
	private int a = 10;
	private String b = "Hello";

	private Test2() {
		System.out.println("Test class no-arg const. got executed");
	}

	private Test2(int a, String b) {
		super();
		System.out.println("Test class 2-arg const. got executed");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
