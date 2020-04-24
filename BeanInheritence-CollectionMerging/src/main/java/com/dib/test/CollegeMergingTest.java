package com.dib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.bean.Courses;

public class CollegeMergingTest 
{
	public static void main(String[] args) 
	{
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	Courses cor=null,cor1=null,cor2=null;
	
	factory=new DefaultListableBeanFactory();
	reader= new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dib/configurations/applicationContext.xml");

	cor=factory.getBean("bfyEngg",Courses.class);
	System.out.println("Basic Courses"+cor);
	System.out.println();
																					
	cor1=factory.getBean("ecfyEngg",Courses.class);
	System.out.println("Electrical Courses"+cor1);
	System.out.println();
	
	cor2=factory.getBean("mechEngg",Courses.class);
	System.out.println("Mechanical Courses"+cor2);
	System.out.println();

	}
}
