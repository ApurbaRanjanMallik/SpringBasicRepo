package com.arm.spring;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class NewInstanceMethodTest1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Load classes
		System.out.println("Enter fully qualified class name to load : ");
		Class c1 = Class.forName(sc.next());

		// Get all constructor of loaded class
		Constructor[] ca = c1.getDeclaredConstructors();
		// Create objects of loaded classes
		Object obj1 = ca[0].newInstance();
		Object obj2 = ca[1].newInstance(18, "Virat");
		System.out.println(obj1.toString());
		System.out.println("******************Apurba*******************");
		System.out.println(obj2.toString());
	}
}
