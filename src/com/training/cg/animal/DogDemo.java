package com.training.cg.animal;

//import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class DogDemo {
	public static void main(String [] args) {
		
		Dog dog1 = new Dog("Oliver","mammal","chihuahua",3);
		Dog dog2 = new Dog("Durin","mammal","pomeranian",3);
		Dog dog3 = new Dog("Goofy","mammal","poodle",3);
		
		System.out.println(dog1.getInfo()+"Cross");
		
		System.out.println(dog1.getInfo("Right now")); // Static Polymorphism
		
		Animal dog4 = new Dog("Pluto","mammal"/*,"bulldog"*/,4); //A Dog is born
		System.out.println(dog4.getInfo());
		
		System.out.println(dog2.getInfo());  // Dynamic Polymorphism
		
		// Creating a set of type 'Dog' in form of HashSet
		
		Set<Dog> allDogs = new HashSet<Dog>();
		allDogs.add(dog1);
		allDogs.add(dog2);
		allDogs.add(dog3);
		
		// For loop for iteration of Sets and Lists
		
		for(Dog d:allDogs) {
			System.out.println(d.name);
		}
		
//		// This method of iterating is too lengthy
//		
//		Iterator<Dog> it = allDogs.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next().getInfo());
//		}
		
		
	}
}
