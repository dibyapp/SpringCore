package com.dib.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.service.IBankService;

public class AroundAdviceTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		IBankService proxy=null;
		ctx = new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		proxy=ctx.getBean("pfb", IBankService.class);
		
		System.out.println("Proxy class"+proxy.getClass()+" Super Class"+proxy.getClass().getSuperclass()+" Interfaces"+Arrays.toString(proxy.getClass().getInterfaces()));
		
		System.out.println("CI"+proxy.calculateCI(100000, 2 , 12));
		System.out.println("SI"+proxy.calculateSI(100000, 2, 12));
	}

}
