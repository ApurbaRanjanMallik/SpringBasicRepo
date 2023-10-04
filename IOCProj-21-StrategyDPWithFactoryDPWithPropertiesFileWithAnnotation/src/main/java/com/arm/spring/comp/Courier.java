package com.arm.spring.comp;

import org.springframework.stereotype.Component;

@Component
public interface Courier {
	public String deliver(int orderId);
}
