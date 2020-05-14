package com.dib.beans;

public class BankService {

	public BankService() {
		System.out.println("BankService.BankService() No-Arg Constructor");
	}

	public float calculateIntrest(float amt, float time) {
		
		System.out.println("BankService.calculateIntrest() ---->> Original");
		
		return (amt*time*0.1f)/100.0f;
		
	}
	
	
}
