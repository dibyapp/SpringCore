package com.sp.beans;

public class Course {

	private int cid;
	private String cname;
	private String fname;
	private String fee;
	public Course(int cid, String cname, String fname, String fee) {
		System.out.println("Course.Course()  4-param Constructor");
		this.cid = cid;
		this.cname = cname;
		this.fname = fname;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fname=" + fname + ", fee=" + fee + "]";
	}
	
}
