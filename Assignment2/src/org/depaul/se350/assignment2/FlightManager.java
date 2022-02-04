package org.depaul.se350.assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.depaul.se350.assignment2.exceptions.IllegalParameterException;
import org.depaul.se350.assignment2.factory.FlightFactory;

public final class FlightManager {
	private static FlightManager flightInstance;
	private static List<Flight> flights;

    public static FlightManager getInstance() {
        if (flightInstance == null) {
        	flightInstance = new FlightManager();
        	flights = new ArrayList<Flight>();
        }
        return flightInstance;
    }

    private FlightManager() {
   
    }
    
    public void createFlight(String type, Airline airline, Airport origin, Airport destination,Date date) throws IllegalParameterException {
       Flight flight = FlightFactory.createFlight(type, airline, origin, destination, date);
       flights.add(flight);
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
