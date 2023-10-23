package com.arm.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arm.spring.bean.WishMessageGenerator;
import com.arm.spring.config.AppConfig;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		System.out.println("MainApp.main()");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator = context.getBean("wmg", WishMessageGenerator.class);
		String wishmessage = generator.generateWishmessage("Virat");
		System.out.println(wishmessage);
		context.close();
	}
}
