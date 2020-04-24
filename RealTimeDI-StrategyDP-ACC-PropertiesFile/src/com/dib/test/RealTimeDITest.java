package com.dib.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.controller.MainController;
import com.dib.vo.StudentVO;

public class RealTimeDITest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		MainController controller=null;
		Scanner sc=null;
		String sno,sname,sadd,m1,m2,m3;
		StudentVO vo=null;
		String result=null;
		
		ctx= new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");
	
		controller=ctx.getBean("controller", MainController.class);
		sc=new Scanner(System.in);
		vo=new StudentVO();
		
		
		System.out.println("Enter Student Number");
		sno=sc.next();
		System.out.println("Enter Student Name");
		sname=sc.next();
		System.out.println("Enter Student Address");
		sadd=sc.next();
		System.out.println("Enter Student Mark 1");
		m1=sc.next();
		System.out.println("Enter Student Mark 2");
		m2=sc.next();
		System.out.println("Enter Student Mark 3");
		m3=sc.next();
		
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		try {
			result=controller.handleStudent(vo);
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Student Registration Failed");
		}
		
		((AbstractApplicationContext) ctx).close();
		
		
		
	}
}
