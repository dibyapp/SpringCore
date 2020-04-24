package com.dib.controller;

import java.util.List;

import com.dib.dto.EmployeeDTO;
import com.dib.service.EmployeeService;

public class MainController 
{

	private EmployeeService service;

	public MainController(EmployeeService service) 
	{
		System.out.println("MainController.MainController() 1-Arg Constructor");
		this.service = service;
	}
	
	public List<EmployeeDTO> fetchEmps(String desg,String desg1)throws Exception
	{
		List<EmployeeDTO> listDTO=null;
		listDTO=service.fetchEmps(desg, desg1);
		return listDTO;
	}
}
