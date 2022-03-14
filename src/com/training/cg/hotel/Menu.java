package com.training.cg.hotel;

public class Menu {
	private String [] snacks = {"Nachos", "French Fries"};
	private String [] drinks = {"Cold Drink","Milkshake"};
	private String [] desserts = {"Ice-Cream","Pastry"};
	public void setSnacks(String [] snacks) {
		this.snacks = snacks;
	}
	public void setDrinks(String [] drinks) {
		this.drinks = drinks;
	}
	public void setDesserts(String [] desserts) {
		this.desserts = desserts;
	}
	public String[] getSnacks() {
		return snacks;
	}
	public String[] getDrinks() {
		return drinks;
	}
	public String[] getDesserts() {
		return desserts;
	}
}
