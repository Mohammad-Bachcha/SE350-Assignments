package com.se350.assignment1;

import java.util.Date;

import com.se350.exceptions.IllegalParameterException;

public class TravelManager {

	public static void main(String[] args) {
		Airport origin = null;
		Airport destination = null;
		Airline airline = null;
		Flight flight = null;
		Date date = new Date("1/13/2022 12:30:00");
		try {
			origin = new Airport("ORD");
			destination = new Airport("LAX");
			airline = new Airline("Spirit");
			flight = new Flight(airline,origin,destination,date);
		} catch (IllegalParameterException e) {
			System.out.println(e); 
		}

		System.out.println(flight);
	}

}
