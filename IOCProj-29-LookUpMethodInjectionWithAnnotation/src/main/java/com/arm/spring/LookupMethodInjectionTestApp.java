package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.beans.Cricketer;

/**
 * Hello world!
 *
 */
public class LookupMethodInjectionTestApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cricketer cricketer = context.getBean("cricketer", Cricketer.class);
		cricketer.bowling();
		cricketer.battting();
		cricketer.battting();
		cricketer.wicketKeeping();
		cricketer.fielding();
		context.close();
	}
}
