package com.priyak.myapp.impl;

import com.priyak.myapp.Coach;
import com.priyak.myapp.IFortuneService;

public class BaseBallCoach implements Coach{
	private IFortuneService fortuneService;

	public BaseBallCoach(IFortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "5 hours of batting practice" + this.fortuneService.getFortune();
	}
	
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
	
	//Initialization Processor
	public void openResources() {
		System.out.println("Inside init method");
	}
	
	public void closeResources() {
		System.out.println("Inside destroy method");
	}

}
