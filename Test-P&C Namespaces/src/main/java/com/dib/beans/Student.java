package com.dib.beans;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student 
{
private int sno;
private String sname;
private Course course;
private Date date;

}
