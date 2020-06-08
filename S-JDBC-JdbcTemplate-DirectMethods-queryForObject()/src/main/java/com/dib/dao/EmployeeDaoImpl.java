package com.dib.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static final String QUERY = "SELECT COUNT(*) FROM EMP";
	
	private JdbcTemplate jt;
	
	public EmployeeDaoImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDaoImpl.EmployeeDaoImpl()");
		this.jt = jt;
	}

	@Override
	public int getEmployeesCount() {
		int count = 0;
		count = jt.queryForObject(QUERY, Integer.class);
		return count;
	}

}
