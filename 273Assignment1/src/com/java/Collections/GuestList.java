package com.java.Collections;

import java.util.*;

public class GuestList {

	public static void main(String[] args) {
		Set <Integer> guestlist = new HashSet<Integer>();
		Scanner sc= new Scanner(System.in);
		int v; char c;
		System.out.println("Welcome! Register here!!");
		do{
		System.out.println("enter your student ID");
		v = sc.nextInt();
		guestlist.add(v);
		System.out.println("want to add more?");
		c = sc.next().trim().charAt(0);
		}while(c =='y');
		
		Iterator<Integer> it= guestlist.iterator();
		System.out.println("Guests in guest list:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	
	}

}
