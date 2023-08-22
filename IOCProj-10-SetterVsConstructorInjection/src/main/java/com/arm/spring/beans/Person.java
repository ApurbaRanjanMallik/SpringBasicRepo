package com.arm.spring.beans;

public class Person {
	private String name;
	private int age;
	private String address;
	private long mobNo;
	private String hobbies;

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", mobNo=" + mobNo + ", hobbies="
				+ hobbies + "]";
	}

}
