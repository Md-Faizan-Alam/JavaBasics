package com.training.cg.bank;

// SavingsAccount is a class that inherits from the AccountType class
public class SavingsAccount extends AccountType{

	SavingsAccount(String name, double amount){
		accountHolder = name;
		initialBalance = amount;
		this.deposit(initialBalance);
	}
	
	public void transfer(SavingsAccount sAcc, double amount) {
		if(this.checkBalance()>amount) {
			sAcc.deposit(amount);
		}
		this.withdraw(amount);
	}
}
