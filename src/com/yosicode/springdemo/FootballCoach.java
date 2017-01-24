package com.yosicode.springdemo;

public class FootballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Do 30 minutes of free kick";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! said FootballCoach. "+fortuneService.getFortune();
	}

}
