package com.java.Collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void testAdd() {
		Set <Integer> guestlist = new HashSet<Integer>();
		Iterator<Integer> it= guestlist.iterator();
		guestlist.add(8547);
		guestlist.add(1254);
		int value = it.next();
		assertEquals(1254,value);
	}

}
