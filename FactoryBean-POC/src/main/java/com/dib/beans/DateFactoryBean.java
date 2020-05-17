package com.dib.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DateFactoryBean implements FactoryBean<Date> {
	
	public DateFactoryBean() {
		System.out.println("DateFactoryBean.DateFactoryBean()");
	}

	private int year;
	private int month;
	private int day;
	
	

	@SuppressWarnings("deprecation")
	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return new Date(year-1900,month-1,day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}

}
