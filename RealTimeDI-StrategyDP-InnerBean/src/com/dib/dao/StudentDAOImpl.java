package com.dib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.dib.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO{
	
	private static final String QUERY="INSERT INTO SPRING_STUDENT VALUES (?,?,?,?,?,?)";

	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl.StudentDAOImpl() 1-Param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count;
		con=ds.getConnection();
		ps=con.prepareStatement(QUERY);
		
		
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setString(3, bo.getSadd());
		ps.setInt(4, bo.getTotal());
		ps.setFloat(5, bo.getAvg());
		ps.setString(6, bo.getResult());
		
		count=ps.executeUpdate();
		return count;
	}
}
