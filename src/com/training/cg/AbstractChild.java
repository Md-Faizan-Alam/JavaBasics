package com.training.cg;

// Abstract classes can not be extended if the extended class does not define every abstract method in the abstract class
public class AbstractChild extends AbstractParent{
	
	// The abstract method 'play' in abstract class 'AbstractPlay' has been defined below
	@Override
	public void play() {
		System.out.println("The method 'play' has been implemented");
	};

}
