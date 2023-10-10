package com.arm.spring.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacerVolOne implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		double principalAmount = (double) args[0];
		double rate = (double) args[1];
		double time = (double) args[2];
		return principalAmount * rate * time / 100;
	}

}
