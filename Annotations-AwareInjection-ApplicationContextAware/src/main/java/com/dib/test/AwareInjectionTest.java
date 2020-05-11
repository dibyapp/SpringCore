package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.MobilePhone;

public class AwareInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx=null;
		MobilePhone phone=null;
	//create IOC container
		System.out.println("1st IOC container");
		 ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		 //get Target bean class object
		 phone=ctx.getBean("phone",MobilePhone.class);
		 System.out.println(".........................................");
		 //invoke methods
		 phone.batteryCharging();
		 phone.entertainment();
		 phone.calls();
		 phone.gaming();
		 phone.shopping();
		
		 ((AbstractApplicationContext) ctx).close();
		
	}

}