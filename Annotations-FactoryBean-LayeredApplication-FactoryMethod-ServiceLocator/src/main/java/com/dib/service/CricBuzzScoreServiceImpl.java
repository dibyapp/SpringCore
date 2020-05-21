package com.dib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dib.external.ExternalScoreComp;

@Component("cbservice")
public class CricBuzzScoreServiceImpl implements CricBuzzScoreService {
	
	@Autowired
	private ExternalScoreComp comp;


	@Override
	public String findScore(int mid) {
		String score=null;
		score = comp.getScore(mid);
		return score;
	}

}
