package com.arm.spring;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Class class1 = context.getBean("dateclass", Class.class);
		System.out.println(class1);
		System.out.println(
				"Class object class name : " + class1.getClass() + " and Class object data : " + class1.toString());
		System.out.println("************************************************************************************");
		Calendar calendar = context.getBean("calendar", Calendar.class);
		System.out.println(calendar);
		System.out.println("Calendar object class name : " + calendar.getClass() + " Calender object data : "
				+ calendar.toString());

		System.out.println("************************************************************************************");
		Properties properties = context.getBean("properties", Properties.class);
		System.out.println(properties);
		System.out.println("System object class name : " + properties.getClass() + " Sysem object data : "
				+ properties.toString());
		System.out.println("************************************************************************************");
		String string1 = context.getBean("s2", String.class);
		System.out.println(string1);
		System.out.println(
				"string1 object class name : " + string1.getClass() + " and object data : " + string1.toString());
		System.out.println("************************************************************************************");
		String string2 = context.getBean("s3", String.class);
		System.out.println(string2);
		System.out.println(
				"string1 object class name : " + string2.getClass() + " and object data : " + string2.toString());
		System.out.println("************************************************************************************");
	}
}
