package org.depaul.se350.assignment2.factory;

import java.util.Date;

import org.depaul.se350.assignment2.Airline;
import org.depaul.se350.assignment2.Airport;
import org.depaul.se350.assignment2.CommercialFlight;
import org.depaul.se350.assignment2.Flight;
import org.depaul.se350.assignment2.exceptions.IllegalParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination,Date date) throws IllegalParameterException {
        if (type.equals("Commercial"))
            return new CommercialFlight(airline,origin,destination,date);
        else return null;
    }
}