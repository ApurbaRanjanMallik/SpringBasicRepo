package com.arm.spring.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WMG class object created bi IOC container");
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setting date object into date varibale of WMG class");
	}

	public String generateMessage(String user) {
		int hour = date.getHours();
		if (hour < 12) {
			return "Good Morning " + user;
		} else if (hour < 16) {
			return "Good Afternoon " + user;
		} else if (hour < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}

}
