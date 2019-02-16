package com.priyak.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyak.myapp.impl.BaseBallCoach;
import com.priyak.myapp.impl.FootBallCoach;


public class SpringApplication {

	public static void main(String[] args) {
		
		// Define the container and load the application context
		@SuppressWarnings("unused")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the Beans
		BaseBallCoach baseBallCaoch = context.getBean("baseBallCoach", BaseBallCoach.class);
		System.out.println(baseBallCaoch.getFortune());
		context.close();
	

	}

}
