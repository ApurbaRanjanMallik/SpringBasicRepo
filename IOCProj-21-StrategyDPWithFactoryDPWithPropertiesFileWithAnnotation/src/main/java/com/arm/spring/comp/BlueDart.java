package com.arm.spring.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Primary
@PropertySource("com/arm/spring/property/info.properties")
public final class BlueDart implements Courier {
	@Value("${person.name}")
	private String name;
	@Value("${person.address}")
	private String address;

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("BlueDart.deliver()");
		return "Order delivered to "+name+" which Order Id : " + orderId + " delivered by BlueDart at "+address;
	}

}
