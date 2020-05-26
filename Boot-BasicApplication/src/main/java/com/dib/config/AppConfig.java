package com.dib.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Calendar getCalendar() {
		Calendar cal = Calendar.getInstance();
		return cal;		
	}
}
