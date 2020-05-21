package com.dib.locator;

import org.springframework.beans.factory.FactoryBean;

import com.dib.external.ExternalScoreComp;
import com.dib.external.ExternalScoreCompImpl;

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
