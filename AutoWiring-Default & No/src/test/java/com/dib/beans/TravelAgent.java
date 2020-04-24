package com.dib.beans;

import lombok.Setter;
import lombok.ToString;

@Setter
public class TravelAgent 
{
private TourPlan tp;


public TravelAgent(TourPlan tp) {
	System.out.println("TravelAgent.TravelAgent() 1-arg Constructor");
	System.out.println();
	this.tp = tp;
}

public String tourInfo()
{
	int lenght=tp.getPlaces().length;
	return tp.toString()+"budget : "+(lenght*5000);
}
}
