package com.arm.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.arm.spring.comp.Vehicle;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");
		Vehicle vehicle = factory.getBean("vehicle", Vehicle.class);
		String msg = vehicle.travel("Vrindavan", 48);
		System.out.println(msg);
	}
}
