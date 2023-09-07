package com.arm.spring.st;

public class ATM {
	private static ATM ATM;

	private ATM() {
		System.out.println("ATM class ATM() which is private");
	}

	public static ATM getInToATM() {
		if (ATM == null) {
			ATM = new ATM();
			return ATM;
		} else {
			return ATM;
		}
	}

	public void withdraw(double amount) {
		System.out.println("Please collect your money of rupees " + amount);
	}
}
