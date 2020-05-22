package com.dib.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.dib")
public class PersistenceConfig {
	@Bean(name="hkds")
	public HikariDataSource getHKDS() 
	{
		HikariDataSource hkds=null;
		hkds= new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkds.setUsername("system");
		hkds.setPassword("cropy");
		hkds.setMinimumIdle(10);
		hkds.setMaximumPoolSize(100);

		return hkds;
	}
}
