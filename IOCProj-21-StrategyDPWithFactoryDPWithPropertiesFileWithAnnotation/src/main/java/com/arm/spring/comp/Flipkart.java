package com.arm.spring.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Flipkart {
	@Autowired
	@Qualifier("logistic")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	public String shopping(String[] items, Float[] prices) {
		// Calculate bill amount
		float billAmount = 0.0f;
		String finalMessage, status;
		for (int i = 0; i < items.length; i++) {
			billAmount += prices[i];
		}
		int orderId = new Random().nextInt(10000);
		// Use courier for shopping
		status = courier.deliver(orderId);
		finalMessage = Arrays.toString(items) + " are purchased with prices " + Arrays.toString(prices)
				+ ".\nThe total bill amount generated Rs: " + billAmount;
		return finalMessage + "\n" + status+".";
	}
}
