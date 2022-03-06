package org.depaul.se350.assignment4.managers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.depaul.se350.assignment4.Airline;
import org.depaul.se350.assignment4.Airport;
import org.depaul.se350.assignment4.exceptions.IllegalParameterException;
import org.depaul.se350.assignment4.factory.FlightFactory;
import org.depaul.se350.assignment4.flights.Flight;

public final class RealFlightManager {
	private static RealFlightManager flightInstance;
	private static List<Flight> flights;

    public static RealFlightManager getInstance() {
        if (flightInstance == null) {
        	flightInstance = new RealFlightManager();
        	flights = new ArrayList<Flight>();
        }
        return flightInstance;
    }

    private RealFlightManager() {
   
    }
    
    public String createFlight(String type, Airline airline, Airport origin, Airport destination,Date date) throws IllegalParameterException {
       Flight flight = FlightFactory.createFlight(type, airline,0, origin, destination, date);
       flights.add(flight);
       return flight.getFlightNumber();
    }
    
    public String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws IllegalParameterException {
        Flight flight = FlightFactory.createFlight(type, airline, capacity, origin, destination, date);
        flights.add(flight);
        return flight.getFlightNumber();
     }
    
    public Flight getFlightByNumber(String flightNum) throws IllegalParameterException {
    	Flight foundFlight = null;
    	for(Flight f : flights) {
    		if(f.getFlightNumber().equals(flightNum)) {
    			foundFlight = f;
    		}
    	}
    	if(foundFlight == null) {
    		throw new IllegalParameterException("A flight with this flight number does not exist");
    	}
    	return foundFlight;
    }
    
}
