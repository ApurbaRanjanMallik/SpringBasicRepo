package com.arm.spring.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart 0-param constructor got executed");
	}

	@Override
	public String deliver(int orderID) {
		return "The order which order ID : " + orderID + " is delivered successfully by BlueDart courier";
	}

}
