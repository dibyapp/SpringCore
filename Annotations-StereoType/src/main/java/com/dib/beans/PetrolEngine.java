package com.dib.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine {

	@Value("${engine.petrol.id}")
	private long eid;
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
