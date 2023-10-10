package com.arm.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Cricketer implements ApplicationContextAware {

	private ApplicationContext context;

	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}

	public void bowling() {
		System.out.println("Cricketer.bowling()");
	}

	public void battting() {
		System.out.println("Cricketer.battting()");
		// Create additional IOC container
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		Bat bat = context.getBean("bat", Bat.class);
		int runs = bat.scoreRuns();
		System.out.println("Batsman did score : " + runs);
	}

	public void fielding() {
		System.out.println("Cricketer.fielding()");
	}

	public void wicketKeeping() {
		System.out.println("Cricketer.wicketKeeping()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.context = applicationContext;
	}
}
