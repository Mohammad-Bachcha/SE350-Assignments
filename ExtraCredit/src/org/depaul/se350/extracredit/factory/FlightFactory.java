package org.depaul.se350.extracredit.factory;

import java.util.Date;

import org.depaul.se350.extracredit.Airline;
import org.depaul.se350.extracredit.Airport;
import org.depaul.se350.extracredit.exceptions.IllegalParameterException;
import org.depaul.se350.extracredit.flights.CommercialFlight;
import org.depaul.se350.extracredit.flights.Flight;
import org.depaul.se350.extracredit.flights.PassengerFlight;

public class FlightFactory {
    public FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws IllegalParameterException {
        if (type.equals("Commercial"))
            return new CommercialFlight(airline,origin,destination,date);
        else if(type.equals("Passenger"))
        	return new PassengerFlight(airline,capacity,origin,destination,date);
        else return null;
    }
}