package com.dib.beans;

import lombok.ToString;

@ToString
public class Course 
{
	private int cno;
	private String cname;
	private float fee;
	
	public Course(int cno, String cname, float fee) 
	{
		this.cno = cno;
		this.cname = cname;
		this.fee = fee;
	}

}
