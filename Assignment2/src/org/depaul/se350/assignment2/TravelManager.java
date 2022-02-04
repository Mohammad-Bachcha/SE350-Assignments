package org.depaul.se350.assignment2;

import java.util.Date;

import org.depaul.se350.assignment2.exceptions.IllegalParameterException;

public class TravelManager {

	public static void main(String[] args) {
		Date date = new Date("2/14/2022 12:30:00");
		try {
			FlightManager manager = FlightManager.getInstance();
			manager.createFlight("Commercial", new Airline("Spirit"), new Airport("ORD"), new Airport("LAX"), date);
		} catch (Exception e) {
			System.out.println(e); 
		}
	}
	
}
