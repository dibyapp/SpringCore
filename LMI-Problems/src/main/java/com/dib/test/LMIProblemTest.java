package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.WebContainer;

// All request will use same request handler object is bad.
// Prototype scope beans are behaving like Singleton scope beans. 
// Because target WebContainer is Singleton so that dependent RequestHandler also behaving like Singleton which is not good.
// Other scope combinations are fine but this scope combination only having problem.

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
