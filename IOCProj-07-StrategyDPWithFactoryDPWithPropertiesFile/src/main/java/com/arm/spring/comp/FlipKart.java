package com.arm.spring.comp;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;

	public FlipKart() {
		System.out.println("FlipKart 0-param constructor got executed");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart setter() method got executed");
	}

	public String shopping(String[] items, double[] prices) {
		double billAmount = 0.0;
		String finalMessage = null;
		int orderID = 0;
		for (int i = 0; i < items.length; i++) {
			billAmount = billAmount + prices[i];
			// Generate order id
			orderID = new Random().nextInt(18000);
			String orderStatus = courier.deliver(orderID);
			finalMessage = "You have been purchased " + Arrays.toString(items) + " which prices are"
					+ Arrays.toString(prices) + " respectively. The total bill amount generated for your order is : "
					+ billAmount;
		}
		return finalMessage + "\n" + courier.deliver(orderID)
				+ ".\nKeep shopping on FlipKart.\nFlipKart Team.\nThank you : )";

	}

}
