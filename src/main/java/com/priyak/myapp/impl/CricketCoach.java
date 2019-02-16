package com.priyak.myapp.impl;

import com.priyak.myapp.Coach;
import com.priyak.myapp.IFortuneService;

public class CricketCoach implements Coach{
	private IFortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public IFortuneService getFortuneService() {
		return this.fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "5 hours of batting practice" + this.fortuneService.getFortune();
	}

}
