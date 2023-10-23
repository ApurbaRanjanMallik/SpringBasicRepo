package com.arm.spring.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public String start() {

		System.out.println("DieselEngine.start()");
		return "Engine started";
	}

	@Override
	public String stop() {
		System.out.println("DieselEngine.stop()");
		return "Engine stopped";
	}

}
