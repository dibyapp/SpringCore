package com.dib.beans;


public abstract class WebContainer{
	
	public abstract RequestHandler getHandler();
	
	public void processRequest(String data)
	{
		RequestHandler rh=null;
		rh=getHandler();
		System.out.println("WebContainer Recieved request having data "+data+" for Proccessing -->> "+this.hashCode());	
		rh.handle(data);
	}

	
}
