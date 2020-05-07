package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.Vehcle;

public class StereoTypeTest {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=null;
		Vehcle v=null;

		ctx= new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");

		v=ctx.getBean("vehcle",Vehcle.class);

		v.journey("PUNE", "BANGALORE");

		((AbstractApplicationContext) ctx).close();

	}
}
