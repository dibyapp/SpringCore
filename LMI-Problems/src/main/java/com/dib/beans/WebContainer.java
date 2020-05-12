package com.dib.beans;

public class WebContainer {
	
	private RequestHandler rs;

	public WebContainer(RequestHandler rs) 
	{
		this.rs = rs;
	}
	
	public void processRequest(String data)
	{
		System.out.println("WebContainer Recieved request having data "+data+" for Proccessing -->> "+this.hashCode());
		rs.handle(data);
	}

}
