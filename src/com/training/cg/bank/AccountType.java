package com.training.cg.bank;

// This class must have implementations of every method mentioned in the Interface that it implements
public class AccountType implements Account{
	String accountHolder;
	double initialBalance;
	private double totalBalance;
	
	@Override
	public void deposit(double amount) {
			totalBalance += amount;
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= totalBalance) {
			totalBalance -= amount;			
		}
		else {
			System.out.println("Insufficeint Balance");
		}
		
	}

	@Override
	public double checkBalance() {
		return totalBalance;
	}
	
}
