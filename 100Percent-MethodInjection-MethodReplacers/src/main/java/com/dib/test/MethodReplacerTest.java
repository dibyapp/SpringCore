package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dib.beans.BankService;
import com.dib.config.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService bank=null;
		
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		bank=ctx.getBean("bank", BankService.class);
		
		System.out.println(bank.calculateIntrest(100000, 12));
		System.out.println();
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
