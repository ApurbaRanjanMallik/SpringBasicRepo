package com.arm.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.arm.spring.beans")
@ImportResource(value = "applicationContext.xml")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
}
