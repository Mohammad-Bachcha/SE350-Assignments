package org.depaul.se350.assignment4.managers;

import java.util.Date;

import org.depaul.se350.assignment4.Airline;
import org.depaul.se350.assignment4.Airport;
import org.depaul.se350.assignment4.exceptions.IllegalParameterException;
import org.depaul.se350.assignment4.flights.Flight;

public class ProxyFlightManager implements FlightManager{
	
	private static RealFlightManager manager;

	@Override
	public String createFlight(String type, Airline airline, Airport origin, Airport destination, Date date) {
		System.out.println("A flight is being created.");
		String flight = "";
		manager = RealFlightManager.getInstance();
		try {
			flight = manager.createFlight(type, airline, origin, destination, date);
		} catch (IllegalParameterException e) {
			System.out.println(e);
		}
		return flight;
	}

	@Override
	public String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination, Date date) {
		System.out.println("A flight is being created.");
		String flight = "";
		manager = RealFlightManager.getInstance();
		try {
			flight = manager.createFlight(type, airline, capacity, origin, destination, date);
		} catch (IllegalParameterException e) {
			System.out.println(e);
		}
		return flight;
	}

	@Override
	public Flight getFlightByNumber(String flightNum) {
		System.out.println("Flight Number: " + flightNum + " is being retrieved");
		Flight flight = null;
		manager = RealFlightManager.getInstance();
		try {
			flight = manager.getFlightByNumber(flightNum);
		} catch (IllegalParameterException e) {
			System.out.println(e);
		}
		return flight;
	}

}
