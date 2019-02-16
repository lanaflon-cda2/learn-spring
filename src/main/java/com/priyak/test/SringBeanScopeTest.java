package com.priyak.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyak.myapp.impl.BaseBallCoach;

public class SringBeanScopeTest {

	public static void main(String[] args) {
		
		// Load the application COntext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-beanScope.xml");
		
		// Get the required bean
		BaseBallCoach coach1 = context.getBean("baseBallCoach1", BaseBallCoach.class);
		BaseBallCoach coach2 = context.getBean("baseBallCoach2", BaseBallCoach.class);
		
		System.out.println(coach1.hashCode());
		System.out.println(coach2.hashCode());
		
		// Close the context
		context.close();
	}

}
