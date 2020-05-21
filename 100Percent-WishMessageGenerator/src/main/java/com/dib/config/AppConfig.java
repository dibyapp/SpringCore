package com.dib.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.dib")
public class AppConfig {

	static {
		System.out.println("AppConfig Static block");
	}
	
	public AppConfig() {
		System.out.println("AppConfig No-Arg Constructor");
	}
	
	@Bean(name="cal")
	public Calendar createCalendar() {
		System.out.println("AppConfig.createCalendar()");
		return Calendar.getInstance();
	}
	
	

}
