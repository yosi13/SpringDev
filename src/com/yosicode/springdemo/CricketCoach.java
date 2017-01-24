package com.yosicode.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;

	private String team;
	
	public void setEmail(String email) {
		System.out.println("cricket coach: inside setEmail");
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setTeam(String team) {
		System.out.println("cricket coach: inside setTeam");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
	
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
