package com.yosicode.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		//random value between 0 and 3, 3 not included
		int val=(int) (Math.random()*3);
		return "Today, I had: "+FortuneService.fortune[val];
		//return "Today is my lucky day";
	}
	
	
}
