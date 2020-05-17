package com.dib.beans;

import java.util.Date;

public class ScheduleReminder {
	
	private Date date;
	
	public ScheduleReminder(Date date) {
		System.out.println("ScheduleReminder.ScheduleReminder() 1-Arg Constructor");
		this.date = date;
	}
	
	@SuppressWarnings("deprecation")
	public String reminderOfTheDay() {
		Date sysDate=null;
		sysDate=new Date();
		
		if(sysDate.getYear()==date.getYear() && sysDate.getMonth()==date.getMonth() && sysDate.getDate()==date.getDate())
		{
			return ": You have an Appointment Today : Call the manager for the Details";
		}
		else
		{
			return ": You dont have Any Appointment today : Just Relax and Chill";
		}
	}

	
	
	

}
