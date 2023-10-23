package com.arm.spring.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public final class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public String start() {
		System.out.println("PetrolEngine.start()");
		return "Engine started";
	}

	@Override
	public String stop() {
		System.out.println("PetrolEngine.stop()");
		return "Engine stopped";
	}

}
