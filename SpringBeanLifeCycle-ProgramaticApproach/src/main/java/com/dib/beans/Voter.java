package com.dib.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Voter implements InitializingBean, DisposableBean {

	public Voter() 
	{
		System.out.println("Voter.Voter() No-arg Constructor");
	}

	private String name;
	private int age;
	private String addrs;
	private Date dov;

	public String checkEligibity() 
	{
		System.out.println("Voter.checkEligibity()");
		if(age<18)
			return "Mr. "+name+" not eligible";
		else 
			return "Mr. "+name+" is eligible";
	}


	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Voter.afterPropertiesSet()");
		if(age<0)
			age=age*-1;

		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Input");

		dov=new Date();

	}

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Voter.destroy()");
		name=null;
		age=0;
		addrs=null;
		dov=null;
	}
}
