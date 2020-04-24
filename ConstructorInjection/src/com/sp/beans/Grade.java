package com.sp.beans;

public class Grade {

	private String sname;
	private int cgpa;
	
	public Grade(String sname, int cgpa) {
		System.out.println("Grade.Grade()  2-param Constructor");
		this.sname = sname;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Grade [sname=" + sname + ", cgpa=" + cgpa + "]";
	}
}
