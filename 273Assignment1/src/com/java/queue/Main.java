package com.java.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze m = new Maze();
		m.enterMaze("A");
		m.enterMaze("B");
		m.enterMaze("C");
		m.enterMaze("D");
		m.display();
		m.enterMaze("E");
		String deleted = m.exitMaze();
		m.display();
	}

}


	
