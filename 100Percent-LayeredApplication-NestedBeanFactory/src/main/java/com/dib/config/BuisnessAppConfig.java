package com.dib.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={ServiceConfig.class,PersistenceConfig.class})
public class BuisnessAppConfig 
{
	
}
