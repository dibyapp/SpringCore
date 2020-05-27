package com.dib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dib.dto.StudentDTO;
import com.dib.service.StudentOperationsService;
import com.dib.vo.StudentVO;

@Controller("controller")
public class MainController {

	@Autowired
	private StudentOperationsService service;
	
	public String handleStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		
		dto=new StudentDTO();
		
		
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		result=service.register(dto);
		
		return result;
	}
}
