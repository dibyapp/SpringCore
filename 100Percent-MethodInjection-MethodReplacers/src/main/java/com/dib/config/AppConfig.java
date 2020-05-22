package com.dib.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.dib")
@ImportResource(locations="com/dib/configurations/applicationContext.xml")
public class AppConfig 
{
	
}
