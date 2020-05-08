package com.dib.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("dEngine")
public class DeiselEngine implements Engine {

	@Value("${engine.deisel.id}")
	private String eid;
	@Override
	public void start() {
		System.out.println("DeiselEngine.start() Started");
		System.out.println("ID " +eid);
		
	}

	@Override
	public void stop() {
		System.out.println("DeiselEngine.stop() Stopped");
		
	}

}
