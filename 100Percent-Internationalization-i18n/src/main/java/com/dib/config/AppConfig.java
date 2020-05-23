package com.dib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean(name = "messageSource")
	public ResourceBundleMessageSource getSource() {
		ResourceBundleMessageSource resource = null;
		resource = new ResourceBundleMessageSource();
		resource.addBasenames("com/dib/commons/App");
		return resource;
	}
	
}
