package com.arm.spring.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.arm.spring.comp.Courier;
import com.arm.spring.comp.FlipKart;

public class FlipKartFactory {

	private static Properties props;
	static {
		System.out.println("FlipKartFactory class static block got executed");
		try {
			FileInputStream fis = new FileInputStream("src/main/java/com/arm/spring/properties/info.properties");
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static FlipKart createFlipkart() throws Exception {
		FlipKart kart = new FlipKart();
		String property = props.getProperty("dependent.comp");
		Class c = Class.forName(property);
		Constructor[] ca = c.getDeclaredConstructors();
		Courier courier = (Courier) ca[0].newInstance();
		kart.setCourier(courier);
		return kart;
	}
}
