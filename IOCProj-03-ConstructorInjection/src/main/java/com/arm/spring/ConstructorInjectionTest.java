package com.arm.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.beans.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class ConstructorInjectionTest {
	public static void main(String[] args) {
		// Hold spring bean configuration file name and location
		// FileSystemResource res = new FileSystemResource(
		// "src/main/java/com/arm/spring/beans/cfgs/applicationContext.xml");
		BeanFactory factory = new ClassPathXmlApplicationContext("com/arm/spring/cfgs/applicationContext.xml");
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg");
		// WishMessageGenerator wmg = (WishMessageGenerator) obj;
		String message = wmg.generateMessage("Apurba : ) ");
		System.out.println(message);
	}
}
