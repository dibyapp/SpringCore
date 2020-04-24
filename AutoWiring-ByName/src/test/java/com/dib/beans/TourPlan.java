package com.dib.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TourPlan 
{
private String[] places;

public TourPlan() 
{
System.out.println("TourPlan.TourPlan() No-Arg Constructor");	
}

}
