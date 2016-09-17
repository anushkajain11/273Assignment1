package com.java.generics;

public class Item<T>{
	private T code;
	
	public void set(T name){
		this.code=name;
	}
	
	public T get(){
		return code;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item <String> item1 = new Item<String>(); 
		Item <Integer> item2 = new Item<Integer>(); 
		
		item1.set("MCD4567");
		item2.set(95710);
		
		System.out.println("Code for the item1: " + item1.get());
		System.out.println("Code for the item2: " + item2.get());

	}

}
