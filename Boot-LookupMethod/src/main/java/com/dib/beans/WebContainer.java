package com.dib.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer{
	
	@Lookup
	public abstract RequestHandler getHandler();
	
	public void processRequest(String data)
	{
		RequestHandler rh=null;
		rh=getHandler();
		System.out.println("WebContainer Recieved request having data "+data+" for Proccessing -->> "+this.hashCode());	
		rh.handle(data);
	}

	
}
