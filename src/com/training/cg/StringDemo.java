package com.training.cg;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "example";
		String str2 = "example";
		
		String str3 = new String("example");
		String str4 = new String("example");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
	}
}