package com.dib.beans;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Voter {

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


	//	Custom Init Method

	public void myInit()throws Exception
	{
		System.out.println("Voter.myInit()");
		//		Bean post Processing
		if(age<0)
			age=age*-1;

		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Input");

		//		Initialize left over properties
		dov=new Date();
	}

	//	Custom Destroy Method
	public void destroy() 
	{
		System.out.println("Voter.destory()");
		name=null;
		age=0;
		addrs=null;
		dov=null;
	}

	//	No destroy method will be executed
	//	If bean scope is prototype
	//	&
	//	Using Bean Factory Container also this
	//	is not possible
	//	we must have to call factory.destroySingletons() method.

}
