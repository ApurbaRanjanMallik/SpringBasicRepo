package com.arm.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
@Lazy(true)
public class WishMessageGenerator {
	@Autowired
	@Qualifier("dt")
	private Date date;

	@Autowired
	public WishMessageGenerator(@Qualifier("dt2") Date date) {
		super();
		this.date = date;
		System.out.println("WishMessageGenerator.WishMessageGenerator() :: Date : " + date);
	}

	@Autowired
	public void setDate(@Qualifier("dt1") Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate():: Date : " + date);
	}

	@Autowired
	public void setCurrentDate(@Qualifier("dt3") Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator.setDate():: Date : " + date);
	}

	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage() :: Date: " + date);
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		if (hour >= 4 && hour < 12) {
			return "Good Morning " + user;
		} else if (hour == 12) {
			return "Good Noon " + user;
		} else if (hour > 12 && hour <= 16) {
			return "Good Afternoon " + user;
		} else if (hour > 16 && hour <= 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}

}
