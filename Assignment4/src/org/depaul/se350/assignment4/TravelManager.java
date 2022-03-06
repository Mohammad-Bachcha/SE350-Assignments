package org.depaul.se350.assignment4;

import java.util.Date;

import org.depaul.se350.assignment4.exceptions.IllegalParameterException;
import org.depaul.se350.assignment4.factory.AirlineFactory;
import org.depaul.se350.assignment4.factory.AirportFactory;
import org.depaul.se350.assignment4.flights.Flight;
import org.depaul.se350.assignment4.managers.FlightManager;
import org.depaul.se350.assignment4.managers.ProxyFlightManager;

public class TravelManager {

	public static void main(String[] args) {
		Date date = new Date("2/14/2022 12:30:00");
		
		Airline airline;
		Airport origin;
		Airport destination;
	
		try {

			FlightManager manager = new ProxyFlightManager();
			airline = AirlineFactory.getAirline("Spirit");	
			origin = AirportFactory.getAirport("ORD");
			destination = AirportFactory.getAirport("LAX");
			
			String createdCommericalFlight = manager.createFlight("Commercial", airline, origin, destination, date);
			System.out.println(createdCommericalFlight);
			System.out.println("");
			
			String createdPassengerFlight = manager.createFlight("Passenger", airline, 535, origin, destination, date);
			System.out.println(createdPassengerFlight);
			System.out.println("");
			
			Flight flight = manager.getFlightByNumber(createdPassengerFlight);
			System.out.println(flight);
			
		} catch (IllegalParameterException e) {
			System.out.println(e);
		} 
	}
	
}
