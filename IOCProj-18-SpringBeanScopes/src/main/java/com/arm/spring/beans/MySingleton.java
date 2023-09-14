package com.arm.spring.beans;

public class MySingleton {
	private static MySingleton mySingleton;

	private MySingleton() {
		System.out.println("MySingleton.MySingleton()");
	}

	public static MySingleton getInstanceOfMySingleton() {
		if (mySingleton == null) {
			mySingleton = new MySingleton();
			return mySingleton;
		} else {
			return mySingleton;
		}
	}
}
