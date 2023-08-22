package com.arm.spring.beans;

public class Employee {
	private int empNo;
	private String name;
	private double salary;

	public Employee(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
}
