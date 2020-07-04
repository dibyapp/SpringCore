package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.service.BankService;

public class AroundAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		BankService proxy=null;
		ctx = new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		proxy=ctx.getBean("pfb", BankService.class);
		
		System.out.println("Proxy class"+proxy.getClass()+" Super Class"+proxy.getClass().getSuperclass());
		
		System.out.println("CI"+proxy.calculateCI(100000, 2 , 12));
		System.out.println("SI"+proxy.calculateSI(100000, 2, 12));
	}

}
