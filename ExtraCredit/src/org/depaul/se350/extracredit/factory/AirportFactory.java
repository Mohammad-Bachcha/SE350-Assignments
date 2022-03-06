package org.depaul.se350.extracredit.factory;

import java.util.HashMap;
import java.util.Map;

import org.depaul.se350.extracredit.Airport;
import org.depaul.se350.extracredit.exceptions.IllegalParameterException;

public class AirportFactory {
	private static Map<String, Airport> airportCache = new HashMap<>();
	
	 public static Airport getAirport(String name) {
	        return airportCache.computeIfAbsent(name, newName -> {
	            try {
					return new Airport(name);
				} catch (IllegalParameterException e) {
					System.out.println(e);
				}
				return null;
	        });
	    }

}
