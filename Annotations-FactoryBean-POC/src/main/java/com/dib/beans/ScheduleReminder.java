package com.dib.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("reminder")
public class ScheduleReminder {
	
	@Autowired
	private Date date;
	
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
