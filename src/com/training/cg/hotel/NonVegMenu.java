package com.training.cg.hotel;

public class NonVegMenu extends Menu{
	private String [] nonVeg = {"Chicken Sandwich", "Chicken Fried Rice", "Chicken Chowmein"};
	
	public String [] getNonVeg() {
		return nonVeg;
	}
	public void setNonVeg(String [] nonVeg) {
		this.nonVeg = nonVeg;
	}
}
