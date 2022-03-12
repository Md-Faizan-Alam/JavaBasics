package com.training.cg.animal;

public class Animal {
	String name;
	String type;
	int age;
	
	Animal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getInfo() {
		return name+" is a "+age+" years old "+type;
	}
}
