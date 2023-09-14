package com.arm.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.arm.spring.beans.Employee;
import com.arm.spring.beans.MySingleton;

/**
 * Hello world!
 *
 */
public class AppOne {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/java/com/arm/spring/cfg/applicationContext.xml");
		Employee employeeOne = context.getBean("employee", Employee.class);
		Employee employeeTwo = context.getBean("employee", Employee.class);
		System.out.println(employeeOne.hashCode() + " : " + employeeTwo.hashCode());
		System.out.println(employeeOne == employeeTwo);
		System.out.println("*********************************************************");
		Employee employeeThree = context.getBean("emp", Employee.class);
		Employee employeeFour = context.getBean("emp", Employee.class);
		System.out.println(employeeOne.hashCode() + " : " + employeeThree.hashCode());
		System.out.println(employeeTwo.hashCode() + " : " + employeeFour.hashCode());
		System.out.println(employeeThree.hashCode() + " : " + employeeFour.hashCode());
		System.out.println(employeeOne == employeeThree);
		System.out.println(employeeTwo == employeeFour);
		System.out.println(employeeThree == employeeFour);
		System.out.println("*********************************************************");
		MySingleton singletonOne = context.getBean("mysingletonone", MySingleton.class);
		MySingleton singletonTwo = context.getBean("mysingletonone", MySingleton.class);
		System.out.println(singletonOne.hashCode() + " : " + singletonTwo.hashCode());
		System.out.println(singletonOne == singletonTwo);
		System.out.println("*********************************************************");
		MySingleton singletonThree = context.getBean("mysingletontwo", MySingleton.class);
		MySingleton singletonFour = context.getBean("mysingletontwo", MySingleton.class);
		System.out.println(singletonOne.hashCode() + " : " + singletonThree.hashCode());
		System.out.println(singletonTwo.hashCode() + " : " + singletonFour.hashCode());
		System.out.println(singletonThree.hashCode() + " : " + singletonFour.hashCode());
		System.out.println(singletonOne == singletonThree);
		System.out.println(singletonTwo == singletonFour);
		System.out.println(singletonThree == singletonFour);
		System.out.println("*********************************************************");
		MySingleton singletonFive = context.getBean("mysingletonthree", MySingleton.class);
		MySingleton singletonSix = context.getBean("mysingletonfour", MySingleton.class);
		System.out.println(singletonOne.hashCode() + " : " + singletonThree.hashCode());
		System.out.println(singletonTwo.hashCode() + " : " + singletonFour.hashCode());
		System.out.println(singletonThree.hashCode() + " : " + singletonFour.hashCode());
		System.out.println(singletonFive.hashCode() + " : " + singletonOne.hashCode());
		System.out.println(singletonSix.hashCode() + " : " + singletonThree.hashCode());
		System.out.println(singletonFive.hashCode() + " : " + singletonSix.hashCode());
		System.out.println(singletonOne == singletonThree);
		System.out.println(singletonTwo == singletonFour);
		System.out.println(singletonThree == singletonFive);
		System.out.println(singletonFour == singletonSix);
		System.out.println(singletonFive == singletonSix);
		context.close();
	}
}
