package com.dib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.dib.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	private static final String QUERY="SELECT ENO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE JOB IN (?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) 
	{
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl() 1 arg Constructor");
		this.ds = ds;
	}

	@Override
	public List<EmployeeBO> getEmps(String desg, String desg1) throws Exception 
	{	
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listBO=null;
		EmployeeBO bo= null;

		try
		{
			con=ds.getConnection();
			ps=con.prepareStatement(QUERY);

			ps.setString(1, desg);
			ps.setString(2, desg1);

			rs=ps.executeQuery();

			listBO=new ArrayList<EmployeeBO>();

			while(rs.next())
			{
				bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				bo.setDeptNo(rs.getInt(5));

				listBO.add(bo);
			}
		}
		catch (SQLException se) 
		{
			throw se;
		}
		catch (Exception e) 
		{
			throw e;  //Exception Re-Throwing
		}
		finally
		{
			try
			{
				if(rs!=null)
					rs.close();
			}
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			try
			{
				if(ps!=null)
					ps.close();
			}
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			try
			{
				if(con!=null)
					con.close();
			}
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
		}
		return listBO;
	}
}
