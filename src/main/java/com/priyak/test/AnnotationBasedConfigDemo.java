package com.priyak.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.priyak.myapp.impl.CreditAccount;
import com.priyak.myapp.impl.SavingsAccount;

public class AnnotationBasedConfigDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		SavingsAccount savingsAccount = context.getBean("savingsAccount", SavingsAccount.class);
		
		System.out.println(savingsAccount);
		
		CreditAccount creditAccount = context.getBean("creditAccount", CreditAccount.class);
		System.out.println(creditAccount.getAccountDetails() + "\n" + creditAccount.getUserDetails());
		
		context.close();
	}

}
