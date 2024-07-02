package com.karthik.ParkingLotSystem.Service;

import java.util.Date;

import com.karthik.ParkingLotSystem.Vehicle.Vehicle;

public class Ticket
{
	private int slotNumber;
	private Vehicle vehicle;
	private Date date;

	public Ticket(int slotNumber, Vehicle vehicle, Date date)
	{
		this.slotNumber = slotNumber;
		this.vehicle = vehicle;
		this.date = date;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public int getSlotNumber()
	{
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber)
	{
		this.slotNumber = slotNumber;
	}

	public Vehicle getVehicle()
	{
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}

	@Override
	public String toString()
	{
		return "Ticket [slotNumber=" + slotNumber + ", date=" + date + ", " + vehicle + "]";
	}
}
