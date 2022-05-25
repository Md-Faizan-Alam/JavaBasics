package com.training.cg.string;

public class StringDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str1 = "example";
		String str2 = "example";
		
		String str3 = new String("example");
		String str4 = new String("example");
		
		// Demonstration of how String object is different from literal String
		System.out.println(str1 == str2);			//true
		System.out.println(str3 == str4);			//false
		System.out.println(str1.equals(str2));		//true
		System.out.println(str3.equals(str4));		//true
		
		System.out.println();
		
		StringBuffer str5 = new StringBuffer("Generation"); // It is Synchronized
		
		// G	e	n	e	r	a	t	i	o	n
		// 0	1	2	3	4	5	6	7	8	9
		
		System.out.println(str5.substring(4, 9)); // returns a new StringBuffer
		System.out.println(str5.charAt(6)); // returns the character at the specified position
		System.out.println(str5.indexOf("e")); // returns the position where the specified character first appears
		
		str5.replace(3, 6, "Hello"); // Replaces the specified substring with the given string
		System.out.println(str5);
		
		// G	e	n	H	e	l	l	o	t	i	o	n
		// 0	1	2	3	4	5	6	7	8	9	10	11
		
		str5.delete(1, 3); // Changes the original StringBuffer
		System.out.println(str5);
		
		// StringBuilder implements the same methods as StringBuffer
		StringBuilder str7 = new StringBuilder("Hello"); // It is not Synchronized
		
		
	}
}
