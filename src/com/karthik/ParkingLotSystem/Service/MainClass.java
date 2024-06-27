package com.karthik.ParkingLotSystem.Service;

import com.karthik.ParkingLotSystem.Vehicle.Bike;
import com.karthik.ParkingLotSystem.Vehicle.Car;
import com.karthik.ParkingLotSystem.Vehicle.Vehicle;

public class MainClass
{

	public static void main(String[] args) throws InterruptedException
	{
		ParkingLot parkingLot = new ParkingLot(10, 10);

		Vehicle bike1 = new Bike("BV01XX");
		Vehicle bike2 = new Bike("BV02XX");

		Ticket biketicket1 = parkingLot.park(bike1);
		Thread.sleep(1000);
		Ticket biketicket2 = parkingLot.park(bike2);
		
		System.out.println(biketicket1);
		System.out.println(biketicket2);

		Vehicle car1 = new Car("CV01XX");
		Vehicle car2 = new Car("CV02XX");

		Ticket carticket1 = parkingLot.park(car1);
		Thread.sleep(1000);
		Ticket carticket2 = parkingLot.park(car2);
		
		System.out.println(carticket1);
		System.out.println(carticket2);
		
		parkingLot.unParkSimple(carticket1);
	}

}
