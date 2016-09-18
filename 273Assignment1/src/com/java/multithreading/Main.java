package com.java.multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller c = new Caller();
		Multithreading m1 = new Multithreading(c,1);
		Multithreading m2 = new Multithreading(c,2);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}

}
