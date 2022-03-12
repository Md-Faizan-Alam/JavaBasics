package com.training.cg.bank;

// CurrentAccount is a new class that inherits the properties of the AccountType class
public class CurrentAccount extends AccountType{
	private double rateOfInterest = 5;
	
	CurrentAccount(String name, double amount, double rate){
		accountHolder = name;
		initialBalance = amount;
		this.deposit(initialBalance);
		this.rateOfInterest = rate;
	}
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	
	public double getInterest(int timePeriod) {
		return (checkBalance()*getRateOfInterest()*timePeriod)/100;
	}
}
