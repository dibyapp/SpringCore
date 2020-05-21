package com.dib.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.dib.external.ExternalScoreComp;
import com.dib.external.ExternalScoreCompImpl;

@Component("locator")
public class ScoreComponentLocator implements FactoryBean<ExternalScoreComp> {

	@Override
	public ExternalScoreComp getObject() throws Exception {
		ExternalScoreComp comp=null;
		comp= new ExternalScoreCompImpl();
		
		return comp;
	}

	@Override
	public Class<?> getObjectType() {
		return ExternalScoreCompImpl.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	

}
