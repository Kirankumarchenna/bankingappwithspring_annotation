package com.nc.model;

import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Account {
	
	@Override
	public String createAccount() {
		return "Account has been created successfully from Savings Account";
	}

}
