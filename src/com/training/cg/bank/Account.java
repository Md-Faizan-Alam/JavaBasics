package com.training.cg.bank;

//100% abstract class is defined as an Interface
public interface Account {
	public void deposit(double amount);  // We are not required to specify it as abstract
	public void withdraw(double amount);
	public double checkBalance();
	
	// Implementing the methods inside interfaces is not allowed
}
