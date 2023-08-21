package com.arm.spring.app;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.arm.spring.comp.FlipKart;

/**
 * Hello world!
 *
 */
public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/arm/spring/config/applicationContext.xml");
		FlipKart kart = factory.getBean("flipkart", FlipKart.class);
		String msg = kart.shopping(new String[] { "Trouser, Shirt, coat, cap, shoes, mobile" },
				new double[] { 8999.00, 5599.00, 7777.00, 18000.00, 64000.00 });
		System.out.println(msg);
	}
}
