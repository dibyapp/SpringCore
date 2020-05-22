package com.dib.dao;

import java.util.List;

import com.dib.bo.EmployeeBO;

public interface EmployeeDAO {

	public List<EmployeeBO> getEmps(String desg, String desg1) throws Exception;
}
