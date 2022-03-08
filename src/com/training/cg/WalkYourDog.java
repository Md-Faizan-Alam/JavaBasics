package com.training.cg;

public class WalkYourDog {
	public static void main(String [] args) {
		Dog dog1 = new Dog();
		
		dog1.name = "Oliver";
		dog1.age = 3;
		dog1.breed = "poodle";
		dog1.type = "mammal";
		
		System.out.println(dog1.getInfo());
		
		System.out.println(dog1.getInfo("Right now")); // Static Polymorphism
		
		Animal dog2 = new Dog(); //A Dog is born
		
		dog2.name = "Pluto";
		dog2.age = 4;
		//dog2.breed = "bulldog";
		dog2.type = "mammal";
		
		System.out.println(dog2.getInfo());  // Dynamic Polymorphism
		
	}
}
