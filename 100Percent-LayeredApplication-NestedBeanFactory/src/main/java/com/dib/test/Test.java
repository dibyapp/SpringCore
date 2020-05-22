package com.dib.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.dib.config.BuisnessAppConfig;
import com.dib.config.PresentationConfig;
import com.dib.controller.MainController;
import com.dib.dto.EmployeeDTO;

public class Test 
{
	public static void main(String[] args) 
	{
		
//		we have to set controller as @Lazy otherwise pre instantiation of child without parent
//		and we will get no such bean exception
		
		ApplicationContext pctx=null,cctx=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		pctx=new AnnotationConfigApplicationContext(BuisnessAppConfig.class);
		
		cctx=new AnnotationConfigApplicationContext(PresentationConfig.class);
		
		((AnnotationConfigApplicationContext) cctx).setParent(pctx);
		
		
		controller=cctx.getBean("controller", MainController.class);
		
		try
		{
			listDTO=controller.fetchEmps("Developer", "Analyst");
			listDTO.forEach(dto->{
				System.out.println(dto);
			});
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) cctx).close();
		((AbstractApplicationContext) pctx).close();
	}
}
