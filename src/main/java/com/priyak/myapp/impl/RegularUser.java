package com.priyak.myapp.impl;

import org.springframework.stereotype.Component;

import com.priyak.myapp.User;

@Component
public class RegularUser implements User{
	
	@Override
	public String getUserAccountDetails() {
		return "I am a regular user";
	}

}
