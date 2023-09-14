package com.arm.spring.beans;

public class Address {
	private String country;
	private String state;
	private int pin;

	public Address() {
		System.out.println("Address.Address()");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", pin=" + pin + "]";
	}

}
