package com.arm.spring.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingEligibilityTest implements InitializingBean, DisposableBean {

	private String name;
	private Integer age;
	private String address;
	private Date verifiedOn;

	public void setName(String name) {
		System.out.println("VotingEligibilityTest.setName()");
		this.name = name;
	}

	public void setAge(Integer age) {
		System.out.println("VotingEligibilityTest.setAge()");
		this.age = age;
	}

	public void setAddress(String address) {
		System.out.println("VotingEligibilityTest.setAddress()");
		this.address = address;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingEligibilityTest.afterPropertiesSet()");
		// Initialize left over properties
		verifiedOn = new Date();
		if (address == null)
			address = "Address Not Provided";
		// Write validation logic
		if (name == null) {
			throw new IllegalArgumentException(" Name is a must required property");
		} else if (age <= 0 || age >= 126) {
			throw new IllegalArgumentException(" Person age must be in the range of 1 through 125");
		}
	}

	public String checkVotingCriteria() {
		if (age < 18) {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is not eligible for voting and it is verified on Date : " + verifiedOn;
		} else {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is eligible for voting and it is verified on Date : " + verifiedOn;
		}

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("VotingEligibilityTest.destroy()");
		// Nullify bean property
		name = null;
		age = 0;
		address = null;
		verifiedOn = null;
	}
}
