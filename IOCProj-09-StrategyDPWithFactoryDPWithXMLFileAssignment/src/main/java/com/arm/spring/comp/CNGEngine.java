package com.arm.spring.comp;

public final class CNGEngine implements Engine {

	@Override
	public void fillGas(double kg) {
		Engine.super.fillGas(kg);
	}

	@Override
	public String fillFuel(double litre) {
		fillGas(litre);
		return litre + " kg CNG filled in your vehicle.";
	}

}
