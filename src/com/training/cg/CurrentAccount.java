package com.training.cg;

public class CurrentAccount extends AccountType{
	private double rateOfInterest = 5;
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	
	public double getInterest(int timePeriod) {
		return (getTotalBalance()*getRateOfInterest()*timePeriod)/100;
	}
}
