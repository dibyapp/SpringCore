package com.dib.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
	
	private int courseId;
	private String courseName;

	@Autowired
	private Calendar doc;
}
