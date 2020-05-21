package com.dib.external;

public class ExternalScoreCompImpl implements ExternalScoreComp {

	@Override
	public String getScore(int mid) {
		if(mid==1234)
			return "IND-350/2 -->> IND vs PAK";
		if(mid==5678)
			return "ENG-145/5 -->> ENG vs AUS";
		if(mid==9100)
			return "BAN-185/5 -->> BAN vs SL";
		
		throw new IllegalArgumentException("Invalid Match ID ");
	}

}
