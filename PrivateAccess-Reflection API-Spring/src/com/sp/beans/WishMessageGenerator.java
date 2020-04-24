package com.sp.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	private WishMessageGenerator() {
		System.out.println("0-param Constructor");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}

	public String generate(String user) {
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return "Good Morning :"+user;
		else if(hour<16)
			return "Good Afternoon :"+user;
		else if(hour<20)
			return "Good Evening :"+user;
		else
			return "Good Night :"+user;
	}
}
