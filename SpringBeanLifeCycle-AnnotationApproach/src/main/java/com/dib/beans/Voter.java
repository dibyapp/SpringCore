package com.dib.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("voter")
public class Voter {

	public Voter() 
	{
		System.out.println("Voter.Voter() No-arg Constructor");
	}

	@Value("Dibya")
	private String name;
	@Value("21")
	private int age;
	@Value("HYD")
	private String addrs;

	public String checkEligibity() 
	{
		System.out.println("Voter.checkEligibity()");
		if(age<18)
			return "Mr. "+name+" not eligible";
		else 
			return "Mr. "+name+" is eligible";
	}


	//	Custom Init Method

	@PostConstruct
	public void myInit()throws Exception
	{
		System.out.println("Voter.myInit()");
		//		Bean post Processing
		if(age<0)
			age=age*-1;

		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid Input");

		//		Initialize left over properties
	}

	//	Custom Destroy Method
	@PreDestroy
	public void destroy() 
	{
		System.out.println("Voter.destory()");
		name=null;
		age=0;
		addrs=null;
	}

	//	No destroy method will be executed
	//	If bean scope is prototype
	//	&
	//	Using Bean Factory Container also this
	//	is not possible
	//	we must have to call factory.destroySingletons() method.

}
