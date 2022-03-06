package org.depaul.se350.assignment4.managers;

import java.util.Date;

import org.depaul.se350.assignment4.Airline;
import org.depaul.se350.assignment4.Airport;
import org.depaul.se350.assignment4.exceptions.IllegalParameterException;
import org.depaul.se350.assignment4.flights.Flight;

public interface FlightManager {
	String createFlight(String type, Airline airline, Airport origin, Airport destination,Date date) throws IllegalParameterException;
	String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date);
	Flight getFlightByNumber(String flightNum);
}
