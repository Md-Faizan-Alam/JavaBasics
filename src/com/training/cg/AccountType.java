package com.training.cg;

public class AccountType implements Account{
	private double initialBalance;
	private double totalBalance = initialBalance;
	private boolean firstDeposit = true;

	public double getTotalBalance() {
		return totalBalance;
	}
	@Override
	public void deposit(double amount) {
		if(firstDeposit) {
			initialBalance = amount;
			totalBalance = amount;
			firstDeposit = false;
		}
		else {
			totalBalance += amount;
		}
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
