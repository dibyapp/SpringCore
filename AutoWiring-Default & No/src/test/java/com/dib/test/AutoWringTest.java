package com.dib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.beans.TravelAgent;

public class AutoWringTest 
{
	public static void main(String[] args) 
	{
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	TravelAgent ta=null, ta1=null;
	
	factory=new DefaultListableBeanFactory();
	reader= new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dib/configurations/applicationContext.xml");

	ta=factory.getBean("agent",TravelAgent.class);
	System.out.println("Tour Plan"+ta.tourInfo());
	System.out.println();
	
	ta1=factory.getBean("agent1",TravelAgent.class);
	System.out.println("Tour Plan"+ta1.tourInfo());
	System.out.println();
																				
	}
}
