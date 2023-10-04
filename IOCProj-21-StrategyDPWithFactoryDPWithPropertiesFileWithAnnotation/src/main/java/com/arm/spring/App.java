package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.comp.Flipkart;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("App.main()");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Flipkart flipkartObj = context.getBean("flipkart", Flipkart.class);
		String resultMessage = flipkartObj.shopping(new String[] { "Shoes", "Trouser", "Shirt", "Perfume" },
				new Float[] { 18000.00f, 10000.0f, 7000.0f, 4500.0f });
		System.out.println(resultMessage);
		context.close();
	}
}
