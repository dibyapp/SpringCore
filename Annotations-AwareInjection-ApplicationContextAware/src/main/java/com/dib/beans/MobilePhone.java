package com.dib.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("phone")
@PropertySource(value="com/dib/commons/info.properties")
public class MobilePhone implements ApplicationContextAware {
	
	@Value("${dependent.beanid}")
	private  String beanId;
	private ApplicationContext ctx;
	
	//Aware injection of applicationContext using same ApplicationContext
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}


	public void setBeanId(String beanId) {
		System.out.println("MobilePhone.setBeandId()");
		this.beanId = beanId;
	}

	public MobilePhone() {
		System.out.println("MobilePhone.MobilePhone()");
	}

	public void gaming() {
		System.out.println("MobilePhone.gaming()::: PubG,Ludo and etc..");
	}

	public void  shopping() {
		System.out.println("MobilePhone.shopping()::: Amazon, Flipkart and etc..");
	}

	public  void entertainment() {
		System.out.println("MobilePhone.entertainment():: Prime Video, netflix and etc..");
	}

	public  void calls() {
		System.out.println("MobilePhone.calls():: Incoming and outgoing calls");
	}

	public void batteryCharging() {
		MobilePhoneBatteryCharger charger=null;
		System.out.println("MobilePhone.batteryCharging()");
		charger=ctx.getBean(beanId,MobilePhoneBatteryCharger.class);
		//invoke method
		charger.charging();

		((AbstractApplicationContext) ctx).close();
	}
}