package com.dib.controller;

import com.dib.dto.StudentDTO;
import com.dib.service.StudentOperationsService;
import com.dib.vo.StudentVO;

public class MainController {

	private StudentOperationsService service;
	private StudentDTO dto;

	public MainController(StudentOperationsService service, StudentDTO dto) {
		System.out.println("MainController.MainController() 1 Param Constructor");
		this.service = service;
		this.dto=dto;
	}
	
	public String handleStudent(StudentVO vo)throws Exception{
		String result=null;
		
		
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
