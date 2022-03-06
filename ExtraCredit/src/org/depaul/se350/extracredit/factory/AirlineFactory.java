package org.depaul.se350.extracredit.factory;

import java.util.HashMap;
import java.util.Map;

import org.depaul.se350.extracredit.Airline;
import org.depaul.se350.extracredit.exceptions.IllegalParameterException;

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
