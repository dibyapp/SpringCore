package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.Voter;

public class BeanLifeCycleTest 
{
	public static void main(String[] args) 
	{
	ApplicationContext ctx=null;
	Voter voter=null;
	ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");

	voter=ctx.getBean("voter",Voter.class);
	System.out.println("Voter Info : "+voter.checkEligibity());
	System.out.println("Injections : "+voter);
	System.out.println();
	
	((AbstractApplicationContext) ctx).close();		
	}
}
