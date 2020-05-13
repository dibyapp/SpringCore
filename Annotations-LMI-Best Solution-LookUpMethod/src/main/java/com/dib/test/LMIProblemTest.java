package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.WebContainer;

// Here we are using Lookup method as the solution
// Using lookup method technique we solved Extra container problem, Global visibility of bean id problem
// Target is not becoming invasive by implementing XXXAware Interface
// Dependent behaves like prototype only so this is the best solution upto now.

public class LMIProblemTest 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=null;
        WebContainer container=null;
        
        ctx=new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
        container=ctx.getBean("container",WebContainer.class);
        
        container.processRequest("Corona");
        System.out.println();
        System.out.println();
        container.processRequest("Hospitals");
        System.out.println();
        System.out.println();
        container.processRequest("Deaths");
        
        ((AbstractApplicationContext) ctx).close();
    }
}
