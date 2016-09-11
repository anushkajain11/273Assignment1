package com.java.queue;

public class Maze {

	Node link = new Node();
	
	Node front=null;
	Node rear= null;
	
	public void enterMaze(String n)
	{
		if(rear == null){
			Node tempLink = new Node();
			tempLink.name = n;
			tempLink.next = null;
			rear =tempLink;
			front = tempLink;
			}
			else{
				Node entry = new Node();
				entry.name = n;
				entry.next = null;
				rear.next =entry;
				rear = entry;
			}
	}
	
	public void exitMaze()
	{
		if(front == null){
		System.out.println("There is no one in Maze!");
		}
		front = front.next;
	}
	
	public void display()
	{
		Node display = front;
		System.out.println("People in maze:" );
		while(display!=null){
			System.out.println(display.name);
			display= display.next;		
		}
	}
	
}
