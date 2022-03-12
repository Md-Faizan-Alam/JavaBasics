package com.training.cg;

public class MyThread implements Runnable {
	Thread t;
	String threadName;
	
	MyThread(String threadName){
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+threadName+" is running");
		for(int i=3; i>0; i--) {
			System.out.println("Thread "+threadName+" iteration : "+i);
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+threadName+" is exiting");
		}
	}
	
	public void go() {
		t = new Thread(this, threadName);
		t.start();
	}
}
