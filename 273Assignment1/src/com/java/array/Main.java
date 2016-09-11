package com.java.array;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int [] array1 = new int[10];
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in a set");
		for(int i=0;i<10;i++){
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter element to search in a set");
		int search = sc.nextInt();
		
		for(int j =0;j<10;j++){
			if(array1[j] == search){
				counter ++; 
			}
		}
		if(counter > 1)
			System.out.println("Match found"  );
		else
			System.out.println("Match not found"  );
	}
}

