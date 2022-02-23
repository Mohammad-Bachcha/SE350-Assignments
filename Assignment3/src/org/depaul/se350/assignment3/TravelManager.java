package org.depaul.se350.assignment3;

import java.util.Date;

import org.depaul.se350.assignment3.exceptions.IllegalParameterException;
import org.depaul.se350.assignment3.factory.AirlineFactory;
import org.depaul.se350.assignment3.factory.AirportFactory;

public class TravelManager {

	public static void main(String[] args) {
		Date date = new Date("2/14/2022 12:30:00");
		
		Airline airline;
		Airport origin;
		Airport destination;
	
		try {
			FlightManager manager = FlightManager.getInstance();
			airline = AirlineFactory.getAirline("Spirit");	
			origin = AirportFactory.getAirline("ORD");
			destination = AirportFactory.getAirline("LAX");
			String createdCommericalFlight = manager.createFlight("Commercial", airline, origin, destination, date);
			String createdPassengerFlight = manager.createFlight("Passenger", airline, 535, origin, destination, date);
			
			System.out.println(createdCommericalFlight);
			System.out.println(createdPassengerFlight);
		} catch (IllegalParameterException e) {
			System.out.println(e);
		} 
	}
	
}
