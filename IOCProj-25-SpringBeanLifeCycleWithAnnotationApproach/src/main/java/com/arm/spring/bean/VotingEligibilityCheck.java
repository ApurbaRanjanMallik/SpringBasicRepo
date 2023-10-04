package com.arm.spring.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component("voting")
@PropertySource("com/arm/spring/properties/info.properties")
public class VotingEligibilityCheck {
	@Value("${person.name}")
	private String name;
	@Value("${person.age}")
	private Integer age;
	@Value("${person.address}")
	private String address;
	private Date verifiedOn;

	@PostConstruct
	public void customInit() {
		System.out.println("VotingEligibilityCheck.customInit()");
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
		System.out.println("VotingEligibilityCheck.checkVotingCriteria()");
		if (age < 18) {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is not eligible for voting and it is verified on Date : " + verifiedOn;
		} else {
			return "Mr./Miss/Mrs." + name + "(" + age + ")" + " belongs from " + address
					+ " is eligible for voting and it is verified on Date : " + verifiedOn;
		}

	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("VotingEligibilityCheck.customDestroy()");
		// Nullify bean property
		name = null;
		age = 0;
		address = null;
		verifiedOn = null;
	}
}
