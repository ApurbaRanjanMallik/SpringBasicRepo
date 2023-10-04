package com.arm.spring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.bean.WishMessageGenerator;

/**
 * Hello world!
 *
 */

public class AutowiredAnnotationMainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		WishMessageGenerator generator = context.getBean("wmg", WishMessageGenerator.class);
		String message = generator.generateWishMessage("Apurba");
		System.out.println(message);
		System.out.println("Spring beans count: " + context.getBeanDefinitionCount());
		System.out.println("Bean Ids : " + Arrays.toString(context.getBeanDefinitionNames()));
		context.close();
	}
}
