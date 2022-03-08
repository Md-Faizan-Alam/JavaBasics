package com.training.cg;

public class Dog extends Animal{
	String breed = "husky";
	//Same method name also requires to have same return type, or else we will get an error
	@Override
	public String getInfo() {
		System.out.println(super.getInfo()); // 'super' refers to the Parent which in this case is the Animal class
		return name+" is a "+age+" years old "+breed;
	}
	
	//Method Overloading
	public String getInfo(String word) {
		return word+" Overloaded Method is executed";
	}
}
