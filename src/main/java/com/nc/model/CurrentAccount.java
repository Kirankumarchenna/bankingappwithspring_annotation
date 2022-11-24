package com.nc.model;

import org.springframework.stereotype.Component;

@Component("current")
public class CurrentAccount implements Account{
	
	@Override 
	public String createAccount() {
		return "Account has been created successfully...from currrent account";
	}

}
