package com.training.cg.string;

public class StringPractice {
	public static void main(String[] args) {
		String greeting = new String("Hello from JAVA");
		String firstWord = new String("Elephant");
		String secondWord = new String("Advertisement");
		String thirdWord = new String("Mississipi");
		
//		H	e	l	l	o	 	f	r	o	m	 	J	A	V	A
//		0	1	2	3	4	5	6	7	8	9	10	11	12	13	14
		
//		E	l	e	p	h	a	n	t
//		0	1	2	3	4	5	6	7
		
//		A	d	v	e	r	t	i	s	m	e	n	t	
//		0	1	2	3	4	5	6	7	8	9	10	11
//		System.out.println(greeting.codePointAt(3));
//		System.out.println(secondWord.compareTo(firstWord));
//		System.out.println(firstWord.concat(secondWord));
//		System.out.println(firstWord.contains("A"));
//		System.out.println(firstWord.contentEquals("Elephant"));
//		System.out.println(firstWord.endsWith("phant"));
//		System.out.println(firstWord.equals("Elephant"));
//		System.out.println(firstWord.equalsIgnoreCase("elePhAnt"));
//		System.out.println(greeting.hashCode());
//		System.out.println(greeting.indexOf("ro"));
//		System.out.println(thirdWord.replace("i","o"));
//		System.out.println(thirdWord.replaceFirst("i","o"));
//		System.out.println(thirdWord.replaceAll("[a-z]{4}","o"));
//		for(String s: thirdWord.split("i")) {
//			System.out.println(s);
//		}
//		System.out.println(thirdWord.replace("i"," Hello "));
//		for(char c: thirdWord.toCharArray()) {
//			System.out.println(c);
//		}
		System.out.println(secondWord.substring(3,6));
	}
}
