package com.arm.spring.factory;

import com.arm.spring.comp.BlueDart;
import com.arm.spring.comp.Courier;
import com.arm.spring.comp.DTDC;
import com.arm.spring.comp.FlipKart;

public class FlipKartFactory {
	public static FlipKart createFlipkart(String courierType) {
		FlipKart kart = new FlipKart();
		Courier courier = null;
		if ("bluedart".equalsIgnoreCase(courierType)) {
			courier = new BlueDart();
		} else if ("dtdc".equalsIgnoreCase(courierType)) {
			courier = new DTDC();
		} else {
			throw new IllegalArgumentException();
		}
		kart.setCourier(courier);
		return kart;
	}

}
