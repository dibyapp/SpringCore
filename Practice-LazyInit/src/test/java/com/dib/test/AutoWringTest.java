package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.TravelAgent;

public class AutoWringTest 
{
	public static void main(String[] args) 
	{
	ApplicationContext ctx=null;

	TravelAgent ta=null, ta1=null;
	
	ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
	

//	ta=ctx.getBean("agent",TravelAgent.class);
//	System.out.println("Tour Plan"+ta.tourInfo());
//	System.out.println();
//	
//	ta1=ctx.getBean("agent",TravelAgent.class);
//	System.out.println("Tour Plan"+ta1.tourInfo());
//	System.out.println();
	
	((AbstractApplicationContext) ctx).close();
																				
	}
}
