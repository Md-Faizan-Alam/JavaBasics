package com.training.cg.dp;

// Creating a Singleton Class named 'Captian'
public class Captain {
	private static Captain obj;
	
	/*	Since the constructor is private, we can no longer instantiate
	 	the object by writing Singleton obj = new Singleton(); */
	private Captain() {
	}
	
	public static Captain getCaptain() {
		if(obj==null) {
			return new Captain();
		}
		return obj;
	}
	
	public void play() {
		System.out.println("Captain is now on the field");
	}
}

//	1. Download jar file and put it in your classpath
//	2. Download Maven :