package com.dib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.beans.Student;

public class AutoWringTest 
{
	public static void main(String[] args) 
	{
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	Student stu=null;
	
	factory=new DefaultListableBeanFactory();
	reader= new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dib/configurations/applicationContext.xml");

	stu=factory.getBean("student",Student.class);
	System.out.println(stu);
	System.out.println();
																				
	}
}
