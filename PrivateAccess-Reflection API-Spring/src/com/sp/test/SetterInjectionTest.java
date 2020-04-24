package com.sp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sp.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main() Start");
		BeanFactory factory=null;
		Object obj=null,obj1=null;
		WishMessageGenerator generator=null;

		factory=new XmlBeanFactory(new ClassPathResource("com/sp/configuration/applicationContext.xml"));
		System.out.println("IOC container created");
		obj=factory.getBean("wmg");
		System.out.println("Target object is gathered");
		generator=(WishMessageGenerator)obj;
		System.out.println(generator.generate("Ayesha"));
		System.out.println("SetterInjectionTest.main() End");
	}
}
