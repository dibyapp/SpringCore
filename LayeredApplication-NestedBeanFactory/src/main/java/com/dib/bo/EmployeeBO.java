package com.dib.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeBO 
{
	private int empNo;
	private String ename;
	private String job;
	private float sal;
	private int deptNo;
}
