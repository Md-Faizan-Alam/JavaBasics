package com.training.cg.student;

public class ExceptionDemo {
	public static void main(String[] args) {
		Grade grade = new Grade();
		try {
			grade.setGrade();
			System.out.println("The Grade is set to : "+grade.getGrade());
		}
		catch(Exception e){
			System.out.println("Grade value not allowed");
//			System.out.println(e.getMessage());
		}
	}
}

//how to stop Set to allow duplicate objects ?



