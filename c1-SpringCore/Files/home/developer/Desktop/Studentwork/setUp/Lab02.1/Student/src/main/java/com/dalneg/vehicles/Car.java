package com.dalneg.vehicles;

public class Car implements Vehicle {
	private int fuel;
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	@Override
	public void move() {
		// 
		if (fuel>0) { 
			fuel--;
			System.out.println("Moving....");}
		else  System.out.println("No Fuel!!");
	}

	
}
