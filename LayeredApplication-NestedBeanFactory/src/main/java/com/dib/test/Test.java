package com.dib.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.controller.MainController;
import com.dib.dto.EmployeeDTO;

public class Test 
{
	public static void main(String[] args) 
	{
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null, cReader=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		
		pFactory=new DefaultListableBeanFactory();
		pReader= new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/dib/configurations/buisness-tier.xml");
		
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader= new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/dib/configurations/presentation-tier.xml");
		
		controller=cFactory.getBean("controller", MainController.class);
		
		try
		{
			listDTO=controller.fetchEmps("Sweeper", "Analyst");
			listDTO.forEach(dto->{
				System.out.println(dto);
			});
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
