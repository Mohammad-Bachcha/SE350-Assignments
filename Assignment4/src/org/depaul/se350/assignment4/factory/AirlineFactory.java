package org.depaul.se350.assignment4.factory;

import java.util.HashMap;
import java.util.Map;

import org.depaul.se350.assignment4.Airline;
import org.depaul.se350.assignment4.exceptions.IllegalParameterException;

public class AirlineFactory {
	private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory() {}

    public static Airline getAirline(String name) throws IllegalParameterException {
        return airlineCache.computeIfAbsent(name, newName -> {
				try {
					return new Airline(name);
				} catch (IllegalParameterException e) {
					System.out.println(e);
				}
				return null;
        });
    }
}
