package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.WebContainer;

// Here we are using Aware injection plus Dependency Lookup.
// Multiple RequestHandler (dependent) objects are created that is good.
// Only one WebContainer object is created this is also good.
// No extra Application Context Container is also created thats really good.
// But Target spring beans are becoming invasive by implementing XXXAware interfaces
// Global visibility of beanID and ApplicationContext object reference unnecessarily there

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
