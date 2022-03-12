package com.training.cg.student;

import java.util.Scanner;

public class Grade {
	private char grade;
	char[] possibleValues = new char[] {'A','B','C','D'};
	
	public void setGrade() throws Exception {
		System.out.print("Enter the grade : ");
		Scanner sc = new Scanner(System.in);
		this.grade = sc.next().charAt(0);
		sc.close();
		for(char c:possibleValues) {
			if(this.grade == c) {
				return;
			}
		}
		throw new MyException("Exception occured");
	}
	
	public char getGrade() {
		return this.grade;
	}
	
}
