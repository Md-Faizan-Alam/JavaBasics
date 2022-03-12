package com.training.cg;

public class ThreadDemo {
	public static void main(String [] args) {
		System.out.println("You are here 1");
		MyThread t1 = new MyThread("thread01");
		t1.go();
		MyThread t2 = new MyThread("thread02");
		t2.go();
		System.out.println("You are here 2");
	}
}
