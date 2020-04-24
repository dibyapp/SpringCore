package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sp.beans.Course;
import com.sp.beans.Grade;
import com.sp.beans.Marks;
import com.sp.beans.Student;

public class ConstructorInjectionTest {
public static void main(String[] args) {
	BeanFactory factory=null;
	Student st=null;
	Marks mk=null;
	Course cs=null;
	Grade gd=null;
	
	factory=new XmlBeanFactory(new ClassPathResource("com/sp/configuration/applicationContext.xml"));
	st=factory.getBean("st",Student.class);
	System.out.println("Order Type ----------------->");
	System.out.println(st);
	
	System.out.println();
	System.out.println("Index Type ----------------->");
	
	mk=factory.getBean("mk",Marks.class);
	System.out.println(mk);
	
	System.out.println();
	System.out.println("Name Type ----------------->");
	
	cs=factory.getBean("cs",Course.class);
	System.out.println(cs);
	
	System.out.println();
	System.out.println("Type Type ----------------->");
	
	gd=factory.getBean("gd",Grade.class);
	System.out.println(gd);
}
}
