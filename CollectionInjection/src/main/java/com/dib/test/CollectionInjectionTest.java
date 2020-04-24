package com.dib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dib.beans.Student;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=null;

		Student st=null;
		
		factory= new XmlBeanFactory(new ClassPathResource("com/dib/configurations/applicationContext.xml"));
		st=factory.getBean("stu", Student.class);
		System.out.println(st);
	}
}
