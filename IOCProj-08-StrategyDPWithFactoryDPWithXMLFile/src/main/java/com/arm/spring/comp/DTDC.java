package com.arm.spring.comp;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC 0-param constructor got executed");
	}

	@Override
	public String deliver(int orderID) {
		return "The order which order ID : " + orderID + " is delivered successfully by DTDC courier";
	}

}
