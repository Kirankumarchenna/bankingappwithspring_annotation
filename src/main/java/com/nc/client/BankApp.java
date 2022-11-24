package com.nc.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nc.model.Account;
import com.nc.model.CurrentAccount;
import com.nc.model.SavingAccount;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		try {
			Account account = (Account)context.getBean(sc.next());
			System.out.println(account.createAccount());
		} catch (Exception e) {
			System.out.println("The bean name you have entered is incorrect "+e.getMessage());
		}
		
	}
}
