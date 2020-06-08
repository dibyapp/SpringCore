package com.dib.service;

import com.dib.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}



	@Override
	public int empCount() {
		int count = 0;
		count = dao.getEmployeesCount();
		return count;
	}

}
