package com.arm.spring.app;

import com.arm.spring.comp.FlipKart;
import com.arm.spring.factory.FlipKartFactory;

/**
 * Hello world!
 *
 */
public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		try {
			FlipKart kart = FlipKartFactory.createFlipkart();
			String shoppingDetails = kart.shopping(new String[] { "Trouser", "Shirt", "vests", "briefs" },
					new double[] { 3500.00, 2800.00, 899.00, 999.0 });
			System.out.println(shoppingDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
