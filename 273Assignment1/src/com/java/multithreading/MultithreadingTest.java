package com.java.multithreading;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultithreadingTest {

	@Test
	public void testSetValue() {
		Caller c= new Caller();
		int actual = c.setValue(10);
		assertEquals(10, actual);
	
	}

}
