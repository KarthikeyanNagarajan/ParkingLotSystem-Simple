package com.karthik.ParkingLotSystem.Service;

import java.util.Date;

public class Ticket
{
	private int slotNumber;
	private String vehicleNumber;
	private String vehicleType;
	private Date date;

	public Ticket(int slotNumber, String vehicleNumber, String vehicleType, Date date)
	{
		this.slotNumber = slotNumber;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
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

	public String getVehicleNumber()
	{
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber)
	{
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleType()
	{
		return vehicleType;
	}

	public void setVehicleType(String vehicleType)
	{
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString()
	{
		return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", date=" + date + "]";
	}
}
