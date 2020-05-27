package com.dib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.dib.beans.WebContainer;

@SpringBootApplication
public class BootLookupMethodApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WebContainer wc = null;
		ctx = SpringApplication.run(BootLookupMethodApplication.class, args);
		wc = ctx.getBean("container",WebContainer.class);
		wc.processRequest("Dibya");
		wc.processRequest("Attack");
		wc.processRequest("Corona");

		((ConfigurableApplicationContext) ctx).close(); 
	}

}
