package com.priyak.myapp.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.priyak.myapp.Account;
import com.priyak.myapp.impl.RegularUser;

@Component
public class CreditAccount implements Account {
	
	private RegularUser user;
	
	public CreditAccount(){
		
	}
	
	@Override
	public String getAccountDetails() {
		return "This is your Credit account";
	}
	
	public String getUserDetails() {
		return this.user.getUserAccountDetails();
	}


	@Autowired
	public void setUser(RegularUser user) {
		this.user = user;
	}
	

}
