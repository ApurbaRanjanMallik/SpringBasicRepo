package com.arm.spring;

import com.arm.spring.st.ATM;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ATM person1 = ATM.getInToATM();
		ATM person2 = ATM.getInToATM();
		person1.withdraw(7000.00);
		person2.withdraw(18000.00);
		System.out.println(person1.hashCode() + "  vs  " + person2.hashCode());
		System.out.println(person1.equals(person2));
		System.out.println(person1 == person2);
		System.out.println(person1 + "  vs  " + person2);
	}
}
