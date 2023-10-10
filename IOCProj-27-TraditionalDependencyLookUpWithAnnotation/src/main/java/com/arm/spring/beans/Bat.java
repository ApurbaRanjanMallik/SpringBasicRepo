package com.arm.spring.beans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Bat {
	public Bat() {
		System.out.println("Bat.Bat()");
	}

	public int scoreRuns() {
		return new Random().nextInt(200);
	}
}
