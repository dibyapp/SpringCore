package com.dib.bean;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Car {
	
	public Car() {
		System.out.println("Car.Car() 0-Param Constructor");
	}
	private String regNo;
	private String ownerName;
	private String color;
	private String type;
	private String engineCC;
	private String fuelType;
	private String company;
	private String model;
	private String variant;
}
