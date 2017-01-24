package com.yosicode.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
	
	public String getDailyFortune(){
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
