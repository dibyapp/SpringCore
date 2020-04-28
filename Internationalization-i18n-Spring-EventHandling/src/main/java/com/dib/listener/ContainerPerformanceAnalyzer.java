package com.dib.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContainerPerformanceAnalyzer implements ApplicationListener {

	private long start,end;
	
	public ContainerPerformanceAnalyzer() {
		System.out.println("ContainerPerformanceAnalyzer.ContainerPerformanceAnalyzer()");
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent event){
		if(event.toString().contains("Refreshed"))
			start=System.currentTimeMillis();
		else if(event.toString().contains("Closed")) {
			end=System.currentTimeMillis();
			System.out.println("Container is in running mode for :"+(end-start)+"ms");
		}
		
		
	}

	

}
