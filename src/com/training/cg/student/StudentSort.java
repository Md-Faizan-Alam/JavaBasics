package com.training.cg.student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentSort {
	public static void main(String[] args) throws Exception{
		Student stud1 = new Student("Anthony", "STB01", "anthony@gmail.com");
		Student stud2 = new Student("Bruce", "STB02", "bruce@gmail.com");
		Student stud3 = new Student("Charlie", "STB03", "charlie@gmail.com");
		Student stud4 = new Student("David", "STB04", "david@gmail.com");
		Student stud5 = new Student("Emily", "STB05", "emily@gmail.com");
		
//		try {
//			stud1.setGrade();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			stud2.setGrade();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			stud3.setGrade();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			stud4.setGrade();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			stud5.setGrade();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		List<Student> allStudents = new LinkedList<Student>();
		
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		allStudents.add(stud4);
		allStudents.add(stud5);
		
		Collections.sort(allStudents, new NewComparator());
		
		for(Student s:allStudents) {
			System.out.println("Student Name : "+s.studName);
			System.out.println("Student ID : "+s.studId);
			System.out.println("Student E-Mail : "+s.studMailId);
			System.out.println("Grade : "+s.getGrade());
			System.out.println();
		}
		
	}
}
