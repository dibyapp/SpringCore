package com.dib.service;

import com.dib.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}



	@Override
	public String empName(int no) {
		String name = null;
		name = dao.getEmployee(no);
		return name;
	}

}
