package com.java.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaryTest {

	@Test
	public void testCalculate() {
		Manager m = new Manager();
		
		assertEquals(2584 ,m.calculate(76, 34));
	}

}
