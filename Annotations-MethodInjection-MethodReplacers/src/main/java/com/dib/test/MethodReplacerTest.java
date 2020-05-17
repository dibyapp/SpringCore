package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService bank=null;
		
		ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		bank=ctx.getBean("bank", BankService.class);
		
		System.out.println(bank.calculateIntrest(100000, 12));
		System.out.println();
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
