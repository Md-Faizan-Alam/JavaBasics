package com.training.cg;

import java.util.*;

public class AssignmentDayOne {
	public static void main(String [] args) {
	
		int luckyNumber = 9;
		int count;
		int userGuess = 11;
		Scanner sc = new Scanner(System.in);

		for(count = 0; userGuess != luckyNumber; count++) {
			
			System.out.print("Make a guess :");
			userGuess = sc.nextInt();
			if(userGuess != luckyNumber) {
				System.out.println("Not really!! Try again");
			}
		}
		sc.close();
		System.out.println("Congrats !! you guessed it right in "+count+" attempts");
	}

}
