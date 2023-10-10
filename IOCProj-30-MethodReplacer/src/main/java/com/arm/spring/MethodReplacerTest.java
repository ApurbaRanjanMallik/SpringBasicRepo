package com.arm.spring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.service.BankService;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BankService service = context.getBean("service", BankService.class);
		System.out.println(service.getClass());
		System.out.println(service.getClass().getSuperclass());
		System.out.println(Arrays.toString(service.getClass().getDeclaredMethods()));
		double intrest = service.calculateIntrest(1800000, 7, 10);
		System.out.println(intrest);
		context.close();
	}
}
