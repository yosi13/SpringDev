package com.yosicode.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println("cricket coach: inside no arg constructor");
	}
	
	//setter method for the injection dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket coach: inside setter methode - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
