package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.ScheduleReminder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleReminder sr=null;
		ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
		
		sr=ctx.getBean("reminder", ScheduleReminder.class);
		System.out.println();
		System.out.println(sr.reminderOfTheDay());
		System.out.println();
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
