package com.java.interfaces;

public class Secretary implements Salary {

	@Override
	public int calculate(int hours, int rate) {
		// TODO Auto-generated method stub
		int bonus = 3000;
		int amount = bonus + (hours * rate);
		return amount;
	}
	

}
