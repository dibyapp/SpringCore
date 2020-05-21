package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dib.beans.WishMessageGenerator;
import com.dib.config.AppConfig;

public class BasicInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessageGenerator gen = null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		gen = ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(gen.generate("Dibya"));
		
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
