package com.karthik.ParkingLotSystem.Vehicle;

public class Vehicle
{
	private String registrationNumber;
	private VehicleType vehicleType;

	public Vehicle(String registrationNumber, VehicleType vehicleType)
	{
		this.registrationNumber = registrationNumber;
		this.vehicleType = vehicleType;
	}

	public String getRegistrationNumber()
	{
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber)
	{
		this.registrationNumber = registrationNumber;
	}

	public VehicleType getVehicleType()
	{
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType)
	{
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString()
	{
		return "Vehicle [registrationNumber=" + registrationNumber + ", vehicleType=" + vehicleType + "]";
	}
}
