package com.arm.spring.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String generateWishmessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishmessage()");
		System.out.println(ldt);
		int hour = ldt.getHour();
		if (hour < 12) {
			return "Good Morning " + userName;
		} else if (hour < 16) {
			return "Good Afternoon " + userName;
		} else if (hour < 20) {
			return "Good Evening " + userName;
		} else if (hour < 4) {
			return "Good Night " + userName;
		} else {
			return "Good Noon " + userName;
		}
	}
}
