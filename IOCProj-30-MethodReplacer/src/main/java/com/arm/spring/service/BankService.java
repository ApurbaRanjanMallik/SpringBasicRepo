package com.arm.spring.service;

public class BankService {
	public double calculateIntrest(double principalAmount, double rate, double time) {
		System.out.println("BankService.calculateIntrest()");
		System.out.println("Compound Intrest Calculation...");
		return (principalAmount * Math.pow(1 + rate / 100, time) - principalAmount);
	}
}
