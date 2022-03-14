package com.training.cg.student;

import java.util.Scanner;

public class Student {
	String studName;
	String studId;
	private char grade;
	String studMailId;
	char[] possibleValues = new char[] {'A','B','C','D'};
	
	Student(String studName, String studId,String studMailId){
		this.studName = studName;
		this.studId = studId;
		this.studMailId = studMailId;
	}
	
	public void setGrade() throws Exception {
		System.out.print("Enter the grade for "+this.studName+" : ");
		Scanner sc = new Scanner(System.in);
		this.grade = sc.next().charAt(0);
		// sc.close();     Should be used at the very end
		for(char c:possibleValues) {
			if(this.grade == c) {
				return;
			}
		}
		throw new MyException("Grade cannot be set to this value");
	}
	public char getGrade() {
		return this.grade;
	}
	
}
