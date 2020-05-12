package com.dib.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	
	private String beanId;

	public WebContainer(String beanId) 
	{
		System.out.println("WebContainer.WebContainer() 1-Arg Constructor");
		this.beanId = beanId;
	}
	
	public void processRequest(String data)
	{
		ApplicationContext ctx=null;
		RequestHandler rh=null;
	
		System.out.println("WebContainer Recieved request having data "+data+" for Proccessing -->> "+this.hashCode());
	
		ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handle(data);
		
		
		((AbstractApplicationContext) ctx).close();
		
	}

}
