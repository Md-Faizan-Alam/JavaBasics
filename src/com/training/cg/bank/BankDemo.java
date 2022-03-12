package com.training.cg.bank;

import java.util.HashSet;
import java.util.Set;

// The Class named 'AccountType' implements the Interface named 'Account'
// The two child classes 'CurrentAccount' and 'SavingsAccount' extend the 'AccountType' class

public class BankDemo {
	public static void main(String[] args) {
		// Creating a Current account and calculating interest for 4 years
		CurrentAccount cAcc1 = new CurrentAccount("Arnold", 1000, 5);
		cAcc1.deposit(6000);
		System.out.println("The interest accumulated by "+cAcc1.accountHolder+" is : "+cAcc1.getInterest(4));
		
		System.out.println();
		
		// Creating SavingsAccounts, processing various transactions and 
		// adding them to a Set in order to iterate them using for loop
		SavingsAccount sAcc1 = new SavingsAccount("Anthony",2000);
		SavingsAccount sAcc2 = new SavingsAccount("Bruce",4000);
		SavingsAccount sAcc3 = new SavingsAccount("Charlie",3000);
		SavingsAccount sAcc4 = new SavingsAccount("David",5000);
		
		sAcc2.transfer(sAcc1, 2000);
		sAcc4.transfer(sAcc3, 3000);
		sAcc1.transfer(sAcc2, 1000);
		sAcc3.transfer(sAcc1, 4000);
		sAcc2.transfer(sAcc4, 1000);
		sAcc4.transfer(sAcc2, 3000);
		sAcc4.deposit(2000);
		sAcc1.withdraw(3000);
		
		Set<SavingsAccount> allAccounts = new HashSet<SavingsAccount>();
		
		allAccounts.add(sAcc2);
		allAccounts.add(sAcc3);
		allAccounts.add(sAcc4);
		allAccounts.add(sAcc1);
		
		// We have no control on the order of traversal since it is HashSet
		for(SavingsAccount sAcc:allAccounts) {
			System.out.println("Account Holder Name : "+sAcc.accountHolder);
			System.out.println("Initial Balance : "+sAcc.initialBalance);
			System.out.println("Total Balance : "+sAcc.checkBalance());
			System.out.println();
		}
	}
}
