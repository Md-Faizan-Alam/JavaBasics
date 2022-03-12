package com.training.cg.misc;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String [] args) {
	
		int luckyNumber = 9;
		int count = 0 ;
		int userGuess;
		Scanner sc = new Scanner(System.in);
		while(true) {
			count++;
			System.out.print("Make a guess :");
			userGuess = sc.nextInt();
			if(userGuess == luckyNumber) {
				System.out.println("Congrats !! you guessed it right in "+count+" attempts");
				break;
			}
			else {
				System.out.println("Not really!! Try again");
			}
		}
		sc.close();

//		for(count = 0; userGuess != luckyNumber; count++) {
//			
//			System.out.print("Make a guess :");
//			userGuess = sc.nextInt();
//			if(userGuess != luckyNumber) {
//				System.out.println("Not really!! Try again");
//			}
//		}
	}
}
