package com.dib.beans;

import java.util.Date;
import java.util.List;

import lombok.Setter;
import lombok.ToString;

@ToString
public class Student {
	private List<String> stuNames;
	private List<Date> dates;
	
	public void setStuNames(List<String> stuNames) {
		this.stuNames = stuNames;
	}
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "Student [stuNames=" + stuNames + ", dates=" + dates + "]";
	}

}
