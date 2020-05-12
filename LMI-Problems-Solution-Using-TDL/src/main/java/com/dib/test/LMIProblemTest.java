package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.WebContainer;

// Here requestHandler objects created as per the request given
// This time RequestHandler is not behaving like singleton scope beans 
// Its working like prototype scope bean only
// But new problem is WebContainer is created for 3 Times also which is not good
// Singleton WebContainer behaving like Prototype, Unnecessary pre-instantiation
// We can solve this problem using lazy-init="true"
// The injected beanID is Unnecessarily visible Globally while need in only one method
// Extra container creation for method call is waste

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
