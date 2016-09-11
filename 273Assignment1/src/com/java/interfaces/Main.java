package com.java.interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		int managerSalary = m.calculate(100, 50);
		Secretary s = new Secretary();
		int secretarySalary = s.calculate(40, 25);
		System.out.println("Manager's salary: "+ managerSalary);
		System.out.println("Secretary's salary: "+ secretarySalary);
		
		
	}

}
