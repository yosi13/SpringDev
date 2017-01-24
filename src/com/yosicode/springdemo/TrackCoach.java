package com.yosicode.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! "+fortuneService.getFortune();
	}

}
