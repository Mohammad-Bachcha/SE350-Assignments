package org.depaul.se350.assignment4.factory;

import java.util.Date;

import org.depaul.se350.assignment4.Airline;
import org.depaul.se350.assignment4.Airport;
import org.depaul.se350.assignment4.exceptions.IllegalParameterException;
import org.depaul.se350.assignment4.flights.CommercialFlight;
import org.depaul.se350.assignment4.flights.Flight;
import org.depaul.se350.assignment4.flights.PassengerFlight;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws IllegalParameterException {
        if (type.equals("Commercial"))
            return new CommercialFlight(airline,origin,destination,date);
        else if(type.equals("Passenger"))
        	return new PassengerFlight(airline,capacity,origin,destination,date);
        else return null;
    }
}