package com.dib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.bean.Car;

public class BeanInheritenceTest {

	public static void main(String[] args) {
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	Car car1=null,car2=null;
	
	factory=new DefaultListableBeanFactory();
	reader= new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/dib/configurations/applicationContext.xml");

	car1=factory.getBean("dibyaCar",Car.class);
	System.out.println(car1);
	System.out.println();
	
	car2=factory.getBean("ayeshaCar",Car.class);
	System.out.println(car2);
	System.out.println();

	}
}
