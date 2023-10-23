package com.arm.spring.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.arm.spring")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}

	@Bean("sysDate")
	public LocalDateTime getDateAndTime() {
		System.out.println("AppConfig.getDateAndTime()");
		return LocalDateTime.now();
	}
}
