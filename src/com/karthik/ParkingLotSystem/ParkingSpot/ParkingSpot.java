package com.karthik.ParkingLotSystem.ParkingSpot;

import com.karthik.ParkingLotSystem.Vehicle.Vehicle;

public class ParkingSpot
{
	private int parkingSpotId;
	private boolean spotFree;
	private Vehicle vehicle;
	private ParkingSpotType parkingSpotType;

	public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType)
	{
		this.parkingSpotId = parkingSpotId;
		this.parkingSpotType = parkingSpotType;
		this.spotFree = true;
	}

	public int getParkingSpotId()
	{
		return parkingSpotId;
	}

	public boolean isSpotFree()
	{
		return spotFree;
	}

	public Vehicle getVehicle()
	{
		return vehicle;
	}

	public void assignVehicletoSpot(Vehicle vehicle)
	{
		this.vehicle = vehicle;
		this.spotFree = false;
	}

	public ParkingSpotType getParkingSpotType()
	{
		return parkingSpotType;
	}

	public void freeVehiclefromSpot()
	{
		this.vehicle = null;
		this.spotFree = true;
	}

}