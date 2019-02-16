package com.priyak.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyak.myapp.impl.BaseBallCoach;

public class BeanLifeCyleAppDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCyle-applicationContext.xml");
		BaseBallCoach baseBallCoach = context.getBean("baseBallCoach", BaseBallCoach.class);
		context.close();
	}

}
