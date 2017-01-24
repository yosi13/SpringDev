package com.yosicode.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main (String [] args){
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//calls methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
//		Coach secondCoach = context.getBean("secondCoach", Coach.class);
//		
//		System.out.println(secondCoach.getDailyWorkout());
//		
		//new methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
