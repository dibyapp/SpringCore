package com.dib.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/dib/commons/info.properties")
public class Vehcle {
	@Value("${vehcle.type}")
	private String type;

	@Autowired
	private Engine engg;

	public void journey(String startPlace, String endPlace) {
		System.out.println("Journey Started From "+startPlace);
		engg.start();
		System.out.println("Journey Going on...");
		engg.stop();
		System.out.println("Journey Stopped At "+endPlace);
	}
}
