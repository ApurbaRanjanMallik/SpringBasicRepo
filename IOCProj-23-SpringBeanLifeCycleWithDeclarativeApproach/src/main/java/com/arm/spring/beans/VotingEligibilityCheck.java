package com.arm.spring.beans;

import java.util.Date;

public class VotingEligibilityCheck {
	private String name;
	private Integer age;
	private String address;
	private Date verifiedOn;

	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName()");
		this.name = name;
	}

	public void setAge(Integer age) {
		System.out.println("VotingEligibilityCheck.setAge()");
		this.age = age;
	}

	public void setAddress(String address) {
		System.out.println("VotingEligibilityCheck.setAddress()");
		this.address = address;
	}

	// Custom init() method
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		// Initialize left over properties
		verifiedOn = new Date();
		if (address == null)
			address = "\"Address Not Provided\"";
		// Write validation logic
		if (name == null) {
			throw new IllegalArgumentException(" Name is a must required property");
		}
		if (age <= 0 || age >= 126) {
			throw new IllegalArgumentException(" Person age must be in the range of 1 through 125");
		}
	}

	// Business method
	public String checkVotingCriteria() {
		System.out.println("VotingEligibilityCheck.checkVotingCriteria()");
		// Business logic
		if (age < 18) {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is not eligible for voting and it is verified on Date : " + verifiedOn;
		} else {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is eligible for voting and it is verified on Date : " + verifiedOn;
		}
	}

	// Custom destroy() method
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		// Nullify bean property
		name = null;
		age = 0;
		address = null;
		verifiedOn = null;
	}

}
