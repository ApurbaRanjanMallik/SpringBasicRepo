package com.arm.spring.comp;

public final class DieselEngine implements Engine {

	@Override
	public String fillFuel(double litre) {
		return litre + " litre diesel filled in your vehicle.";
	}

}
