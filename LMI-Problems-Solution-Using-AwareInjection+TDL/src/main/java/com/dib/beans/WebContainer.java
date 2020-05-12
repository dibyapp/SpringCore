package com.dib.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WebContainer implements ApplicationContextAware {
	
	private String beanId;
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("WebContainer.setApplicationContext()");
		this.ctx=ctx;
	}

	
	public WebContainer(String beanId) 
	{
		System.out.println("WebContainer.WebContainer() 1-Arg Constructor");
		this.beanId = beanId;
	}
	
	public void processRequest(String data)
	{
		RequestHandler rh=null;
		System.out.println("WebContainer Recieved request having data "+data+" for Proccessing -->> "+this.hashCode());	
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handle(data);
	}

	
}
