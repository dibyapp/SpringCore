package com.dib.service;

import com.dib.external.ExternalScoreComp;

public class CricBuzzScoreServiceImpl implements CricBuzzScoreService {
	

	private ExternalScoreComp comp;

	public CricBuzzScoreServiceImpl(ExternalScoreComp comp) {
		System.out.println("CricBuzzScoreServiceImpl.CricBuzzScoreServiceImpl()");
		this.comp = comp;
	}

	@Override
	public String findScore(int mid) {
		String score=null;
		score = comp.getScore(mid);
		return score;
	}

}
