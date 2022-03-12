package com.training.cg.animal;

public class Cat extends Animal{
	Cat(String name, String type, int age){
		super(name,type,age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Cat) {
			Cat c = (Cat) obj;
			return ( this.name.equals(c.name) && this.type.equals(c.type) && this.age==c.age );
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash = age*36;
		hash += name.hashCode();
		return hash;
		
	}
	
}
