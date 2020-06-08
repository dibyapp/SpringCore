package com.dib.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static final String QUERY = "SELECT ENAME FROM EMP WHERE ENO=?";
	
	private JdbcTemplate jt;
	
	public EmployeeDaoImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDaoImpl.EmployeeDaoImpl()");
		this.jt = jt;
	}

	@Override
	public String getEmployee(int no) {
		String name = null;
		name = jt.queryForObject(QUERY, String.class, no);
		return name;
	}

}
