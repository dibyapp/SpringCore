package com.dib.locator;


import com.dib.external.ExternalScoreComp;
import com.dib.external.ExternalScoreCompImpl;

//@Component("locator")
public class ScoreComponentLocator{

	public static ExternalScoreComp getInstance(){
		ExternalScoreComp comp=null;
		comp= new ExternalScoreCompImpl();
		return comp;

	}
}
