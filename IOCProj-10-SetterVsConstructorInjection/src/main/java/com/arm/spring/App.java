package com.arm.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.arm.spring.beans.Employee;
import com.arm.spring.beans.Person;
import com.arm.spring.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");

		Employee employee = factory.getBean("employee", Employee.class);
		System.out.println(employee);

		Student student = factory.getBean("studnet", Student.class);
		System.out.println(student);

		Person person = factory.getBean("person", Person.class);
		System.out.println(person);
	}
}
