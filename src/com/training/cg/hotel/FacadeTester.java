package com.training.cg.hotel;

import java.util.Scanner;
public class FacadeTester {
	public static void main(String [] args) {
		HotelKeeper hk = new HotelKeeper();
		System.out.println("HotelKeeper : Which menu would you like to have?");
		System.out.print("Your Reply : ");
		Scanner sc = new Scanner(System.in);
		String reply = sc.nextLine();
		sc.close();
		System.out.println();
		
		NonVegMenu nonVegMenu = null;
		VegMenu vegMenu = null;
		String [] allStrings = null;
		
		if(reply.equalsIgnoreCase("non veg")) {
			nonVegMenu = hk.getNonVegMenu();
			
			System.out.println("Snacks :");
			System.out.println();
			allStrings = nonVegMenu.getSnacks();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Main Course :");
			System.out.println();
			allStrings = nonVegMenu.getNonVeg();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Drinks :");
			System.out.println();
			allStrings = nonVegMenu.getDrinks();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Desserts :");
			System.out.println();
			allStrings = nonVegMenu.getDesserts();
			for(String s:allStrings) {
				System.out.println(s);
			}
		}
		else if(reply.equalsIgnoreCase("veg")) {
			vegMenu = hk.getVegMenu();
			
			System.out.println("Snacks :");
			System.out.println();
			allStrings = vegMenu.getSnacks();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Main Course :");
			System.out.println();
			allStrings = vegMenu.getVeg();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Drinks :");
			System.out.println();
			allStrings = vegMenu.getDrinks();
			for(String s:allStrings) {
				System.out.println(s);
			}
			System.out.println();
			
			System.out.println("Desserts :");
			System.out.println();
			allStrings = vegMenu.getDesserts();
			for(String s:allStrings) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("Sorry, I didn't catch that.");
		}
	}
}

//put 2-2 dishes in Veg and NonVeg menus and display them when the user calls for them
