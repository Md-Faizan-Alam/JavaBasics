package com.training.cg.animal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		Set<String> allStrings = new TreeSet<String>(); // A set of Strings can be made because String is a class
		
		// The code shown below is not allowed because 'int' is a primitive datatype and not a Class
		//Set<int> allInt = new HashSet<int>(); 
		
		// The code shown below is possible because 'Integer' is a Class
		Set<Integer> allIntegers = new HashSet<Integer>();
		
		// 'Integer' is the Class-Version of the primitive datatype 'int'.
		// Similarly Classes named 'Double', 'Byte', 'Character', 'Boolean','Float' also exist
		// They are known as 'Wrapper Classes'
		
		//	A list should be sorted using Comparator and Comparable
		//	A Set cannot be sorted using Comparator.
		//	We should instead use the Comparable or TreeSet if we want a sorted set.
		
		//	A TreeSet automatically sorts its elements
		
		allStrings.add("Delta");
		allStrings.add("Charlie");
		allStrings.add("Alpha");
		allStrings.add("Bravo");
		
		for(String s:allStrings) {
			System.out.println(s);
		}
		
		System.out.println();

		/*	A HashSet does not iterate in the order in whoch elements were added
			but it does not sort the elements either.*/
		
		allIntegers.add(5);
		allIntegers.add(3);
		allIntegers.add(1);
		allIntegers.add(2);
		
		for(Integer s:allIntegers) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// Instantiating a Map
		Map<String,String> myMap = new HashMap<String,String>();
		
		myMap.put("A","Alpha");
		myMap.put("B","Bravo");
		myMap.put("C","Charlie");
		
		for(Map.Entry<String, String> entry : myMap.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}
		
		System.out.println();
		
		//	Creating a Set of Dogs with a pair of duplicates
		Set<Dog> allDogs = new HashSet<>();
		allDogs.add(new Dog("Oliver","mammal","chihuahua",2));
		allDogs.add(new Dog("Durin","mammal","bulldog",1));
		allDogs.add(new Dog("Goofy","mammal","poodle",3));
		allDogs.add(new Dog("Goofy","mammal","poodle",3));
		
		for(Dog d:allDogs) {
			System.out.println(d.getInfo());
		}
		
		System.out.println();
		
		//	Creating a Set of Cats with a pair of duplicates
		Set<Cat> allCats = new HashSet<>();
		allCats.add(new Cat("Tom","mammal",3));
		allCats.add(new Cat("Dora","mammal",1));
		allCats.add(new Cat("Bron","mammal",2));
		allCats.add(new Cat("Bron","mammal",2));
		
		for(Cat c:allCats) {
			System.out.println(c.getInfo());
		}
		/*	The duplicates are not repeated because the 'equals()' and 'hashCode()'
			methods have been overriden for the class Cat */
		
	}
}

// Q. How to stop a Set from adding duplicate objects ?
// Ans. A unique code known as Hash code is alloted to every object when they are instantiated
// 		This code will be different for two Objects of a custom class even if they are identical in all other aspects
//		This can be avoided by Overriding the hashCode() and equals() method for a given class
//		These two methods belong to the class named 'Object'.
//		This Overriding has been done by default for classes like 'String', 'Integers' etc.
