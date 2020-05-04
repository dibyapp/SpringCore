package com.dib.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	
	private int sno;
	private String name;
	
//	@Qualifier("crs")
	@Qualifier("c1")
	@Autowired
	private Course course;
	
	@Autowired(required=false)
	private Date dob;

}
