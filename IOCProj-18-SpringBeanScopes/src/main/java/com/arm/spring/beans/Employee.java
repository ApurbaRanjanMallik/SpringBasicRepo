package com.arm.spring.beans;

public class Employee {
	private int empId;
	private String role;
	private Address address;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", role=" + role + ", address=" + address + "]";
	}

}
