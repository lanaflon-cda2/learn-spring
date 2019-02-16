package com.priyak.myapp.impl;

import com.priyak.myapp.Coach;
import com.priyak.myapp.IFortuneService;

public class FootBallCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private IFortuneService fortuneService;
	
	public FootBallCoach() {
		
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Penalty practice for 50 minutes";
	}
	
	public String getRandomFortune()
	{
		return this.fortuneService.getFortune();
	}
}
