package com.arm.spring.comp;

public class PetrolEngine implements Engine {

	@Override
	public String fillFuel(double litre) {
		return litre + " litre petrol filled in your vehicle.";
	}

}
