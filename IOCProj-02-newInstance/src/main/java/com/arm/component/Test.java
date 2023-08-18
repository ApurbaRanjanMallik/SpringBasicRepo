package com.arm.component;

public class Test {
	private int a = 10;
	private String b = "Hello";

	public Test() {
		System.out.println("Test class no-arg const. got executed");
	}

	public Test(int a, String b) {
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
