package com.dib;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dib.controller.MainController;
import com.dib.vo.StudentVO;

@SpringBootApplication
public class BootLayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		MainController controller = null;
		StudentVO vo = new StudentVO();
		ctx = SpringApplication.run(BootLayeredApplication.class, args);
		controller = ctx.getBean("controller", MainController.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Number");
		String sno=sc.next();
		System.out.println("Enter Student Name");
		String sname=sc.next();
		System.out.println("Enter Student Address");
		String sadd=sc.next();
		System.out.println("Enter Student Mark 1");
		String m1=sc.next();
		System.out.println("Enter Student Mark 2");
		String m2=sc.next();
		System.out.println("Enter Student Mark 3");
		String m3=sc.next();
		
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		try {
			String result=controller.handleStudent(vo);
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("Student Registration Failed");
		}
	}

}
