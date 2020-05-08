package com.dib.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("pEngine")
public class PetrolEngine implements Engine {

	@Value("(${engine.petrol.id}")
	private String eid;
	@Override
	public void start() {
		System.out.println("PetrolEngine.start() Started");
		System.out.println("ID" +eid);
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() Stopped");
		
	}

}
