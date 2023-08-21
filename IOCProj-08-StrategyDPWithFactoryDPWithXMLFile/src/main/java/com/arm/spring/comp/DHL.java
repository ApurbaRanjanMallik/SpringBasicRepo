package com.arm.spring.comp;

public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL 0-param constructor got executed");
	}

	@Override
	public String deliver(int orderID) {
		return "The order which order ID : " + orderID + " is delivered successfully by DHL courier";
	}

}
