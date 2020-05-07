package com.dib.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("dEngine")
public class DeiselEngine implements Engine {

	@Value("${engine.deisel.id}")
	private long eid;
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
