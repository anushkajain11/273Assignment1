package com.java.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MazeTest {

	@Test
	public void testEnterMaze() {
		Maze m = new Maze();
		m.enterMaze("Alex");
		assertEquals("Alex", m.rear.name);
	}
	
	@Test
	public void testExitMaze(){
		Maze m = new Maze();
		m.enterMaze("Bob");
		String actual = m.front.name;
		String deleted = m.exitMaze();
		assertEquals(deleted , actual);
		
	}

}
