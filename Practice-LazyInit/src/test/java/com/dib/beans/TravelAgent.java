package com.dib.beans;

import lombok.Setter;
import lombok.ToString;

@Setter
public class TravelAgent 
{
private TourPlan tp;



public String tourInfo()
{
	int lenght=tp.getPlaces().length;
	return tp.toString()+"budget : "+(lenght*5000);
}



public TravelAgent() {
	System.out.println("TravelAgent.TravelAgent()");
}

}
