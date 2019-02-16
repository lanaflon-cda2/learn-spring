package com.priyak.myapp.impl;

import java.util.Random;

import com.priyak.myapp.IFortuneService;

public class RandomFortuneService implements IFortuneService {
	private String[] listOfFortunes = {"Fortune 1","Fortune 2","Fortune 3"};
	
	public RandomFortuneService() {
		
	}
	
	public String getRandomFortune() {
		Random rand = new Random();
		return this.listOfFortunes[rand.nextInt(listOfFortunes.length)];
	}
	
	@Override
	public String getFortune() {
		return this.getRandomFortune();
	}

}
