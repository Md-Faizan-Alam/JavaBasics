package com.training.cg;

public class BankDemo {
	public static void main(String[] args) {
		SavingsAccount sAcc1 = new SavingsAccount();
		
		sAcc1.deposit(5000);
		System.out.println(sAcc1.checkBalance());
		
		sAcc1.withdraw(2000);
		System.out.println(sAcc1.checkBalance());
		
		CurrentAccount cAcc1 = new CurrentAccount();
		
		cAcc1.deposit(6000);
		System.out.println(cAcc1.getInterest(5));
	}
}
