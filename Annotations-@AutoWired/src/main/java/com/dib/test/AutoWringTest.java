package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.Student;

//For Ambiguity***
//Solution-1 : we can use primary="true" in Beans tag
//Solution-2 : we can use @Qualifier("beanID") on field
//Solution-3 : we can take property name & Bean ID same
//Solution-4 : we can take <qualifier value="c1"/> and use Qualifier("qualifierName") on field
//Solution-5 : we can take use autowire-candidate="false" on bean

//Using @Autowired on methods***
//::you can use @Autowired on top of Setters but method argument must be matched with bean id
//::you can add <qualifier value="c1"/> in beans and use Qualifier ("qualifierName") on Setter method

//Using @Autowired on Constructor
//::you can use but you must avoid ambiguity because its always uses byType mode of autowiring
//::you can use @Qualifier("qualifierName") just before the Constructor parameter not on the top of constructor

//Points***
//You can use Autowired(required="false") if you don't want to inject one values


public class AutoWringTest 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=null;
	Student ta=null, ta1=null;
	
	ctx= new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");

	ta=ctx.getBean("stud",Student.class);

	System.out.println(ta);
	
	((AbstractApplicationContext) ctx).close();
																				
	}
}
