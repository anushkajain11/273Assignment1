package com.java.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride ride= new Ride();
		ride.enterRide(1);
		ride.enterRide(2);
		ride.enterRide(3);
		ride.enterRide(4);
		ride.showRiders();
		ride.exitRide();
		ride.exitRide();
		//ride.exitRide();
		ride.showRiders();
		
	}

}
