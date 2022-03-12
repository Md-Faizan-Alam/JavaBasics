package com.training.cg.animal;

public class Dog extends Animal{
	String breed = "husky";
	
	Dog(String name, String type, String breed, int age) {
		super(name,type,age);
		this.breed = breed;
	}
	Dog(String name, String type, int age){
		super(name,type,age);	/* 'super' refers to the Parent class
									which in this case is the Animal class */
	}
	
	//Same method name also requires to have same return type, or else we will get an error
	@Override
	public String getInfo() {
		return name+" is a "+age+" years old "+breed;
	}
	
	//Method Overloading
	public String getInfo(String word) {
		return word+" Overloaded Method is executed";
	}
}
