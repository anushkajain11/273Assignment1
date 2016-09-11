package com.java.interfaces;

public class Manager implements Salary {

	@Override
	public int calculate(int hours, int rate) {
		return hours*rate;
		
	}

}
