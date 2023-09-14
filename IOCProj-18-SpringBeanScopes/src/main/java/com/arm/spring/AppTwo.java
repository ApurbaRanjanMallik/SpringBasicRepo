package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.beans.Employee;
import com.arm.spring.beans.MySingleton;

public class AppTwo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Employee employeeOne = context.getBean("employee", Employee.class);
		Employee employeeTwo = context.getBean("employee", Employee.class);
		System.out.println(employeeOne.hashCode() + " : " + employeeTwo.hashCode());
		System.out.println(employeeOne == employeeTwo);
		System.out.println("*********************************************************");
		MySingleton mySingletonOne = context.getBean("myprototypeone", MySingleton.class);
		MySingleton mySingletonTwo = context.getBean("myprototypetwo", MySingleton.class);
		System.out.println(mySingletonOne.hashCode() + " : " + mySingletonTwo.hashCode());
		System.out.println(mySingletonOne == mySingletonTwo);
		System.out.println("*********************************************************");
		MySingleton mySingletonThree = context.getBean("myprototypethree", MySingleton.class);
		MySingleton mySingletonFour = context.getBean("myprototypefour", MySingleton.class);
		System.out.println(mySingletonThree.hashCode() + " : " + mySingletonFour.hashCode());
		System.out.println(mySingletonThree == mySingletonFour);
		context.close();
	}
}
