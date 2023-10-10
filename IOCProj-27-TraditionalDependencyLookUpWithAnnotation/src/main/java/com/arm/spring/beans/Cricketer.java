package com.arm.spring.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Cricketer {
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}

	public void bowling() {
		System.out.println("Cricketer.bowling()");
	}

	public void battting() {
		System.out.println("Cricketer.battting()");
		// Create additional IOC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bat bat = context.getBean("bat", Bat.class);
		int runs = bat.scoreRuns();
		System.out.println("Batsman did score : " + runs);
		context.close();
	}

	public void fielding() {
		System.out.println("Cricketer.fielding()");
	}

	public void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}
}
