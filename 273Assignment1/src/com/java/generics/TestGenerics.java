package com.java.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGenerics {

	@Test
	public void testSet() {
		
		Item <String> item1 = new Item<String>();
		item1.set("MCD421");
		String actual =item1.get();
		assertEquals("MCD421", actual);
		
		
	}
	
	@Test
	public void testGet(){
		Item <Integer> item2 = new Item<Integer>();
		item2.set(4562);
		int value=item2.get();
		assertEquals(value, 4562);
	}

}
