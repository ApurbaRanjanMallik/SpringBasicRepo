package com.arm.spring.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {
	@Value("${person.name}")
	private String name;
	@Value("${person.address}")
	private String address;
	public DHL() {
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("DHL.deliver()");
		return "Order delivered to "+name+" which Order Id : " + orderId + " delivered by DHL at "+address;
	}

}
