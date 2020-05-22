package com.dib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.dib.dto.EmployeeDTO;
import com.dib.service.EmployeeService;

@Controller("controller")
@Lazy
public class MainController 
{
	@Autowired
	private EmployeeService service;
	
	public List<EmployeeDTO> fetchEmps(String desg,String desg1)throws Exception
	{
		List<EmployeeDTO> listDTO=null;
		listDTO=service.fetchEmps(desg, desg1);
		return listDTO;
	}
}
