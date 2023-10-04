package com.arm.spring.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("courier")
@PropertySource("com/arm/spring/property/info.properties")
public final class DTDC implements Courier {
	@Value("${person.name}")
	private String name;
	@Value("${person.address}")
	private String address;
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("DTDC.deliver()");
		return "Order delivered to "+name+" which Order Id : " + orderId + " delivered by DTDC at "+address;
	}
}
