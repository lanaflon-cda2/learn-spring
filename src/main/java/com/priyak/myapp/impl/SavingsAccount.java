package com.priyak.myapp.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.priyak.myapp.Account;
import com.priyak.myapp.User;

@Component
public class SavingsAccount implements Account {
	private User user;
	
	public  SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// Autowire the dependency - Constructor Autowire
	@Autowired
	public SavingsAccount(User user) {
		this.user = user;
	}
	
	@Override
	public String getAccountDetails() {
		return "This is Savings Account";
	}
	
	public String getUserDetails() {
		return this.user.getUserAccountDetails();
	}
	
	@Override
	public String toString() {
		return "User details: " + this.user.getUserAccountDetails() + 
						"\nAccount Details: " + this.getAccountDetails();
	}
	

}
