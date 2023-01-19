package com.dalneg.vehicles;

public class Driver {

	private Vehicle vehicle;
	private String driverName;
	
	public Driver(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	public Driver() {
		
	}
	public void drive()
	{
		vehicle.move();
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
