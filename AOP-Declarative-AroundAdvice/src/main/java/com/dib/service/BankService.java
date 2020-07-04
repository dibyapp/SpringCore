package com.dib.service;

public class BankService {
	
	public float calculateSI(float amt, float rate, float time) {
		System.out.println("BankService.calculateSIM() Target Method - One");	
		return (amt*rate*time)/100.0f;
	}
	
	public float calculateCI(float amt, float rate, float time) {
		System.out.println("BankService.calculateCI() Target Method - Two");
		return (float) ((amt*Math.pow((1+rate/100),time)))-amt;
	}
}
