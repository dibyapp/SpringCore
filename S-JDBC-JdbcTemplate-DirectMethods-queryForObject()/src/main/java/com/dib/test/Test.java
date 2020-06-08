package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.service.EmployeeService;
import com.dib.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		EmployeeService service = null;
		
		ctx = new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		
		service = ctx.getBean("service", EmployeeServiceImpl.class);
		
		System.out.println(service.empCount());
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
