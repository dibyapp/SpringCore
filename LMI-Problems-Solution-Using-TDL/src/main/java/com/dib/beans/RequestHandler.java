package com.dib.beans;

public class RequestHandler {
	
	private static int count;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler.RequestHandler() : No arg constructor : "+count);
	}
	
	public void handle(String data)
	{
		System.out.println("Handling request using object : "+count+" Having data as "+data+" -->> "+this.hashCode());
	}

}
