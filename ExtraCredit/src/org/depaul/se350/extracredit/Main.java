package org.depaul.se350.extracredit;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.depaul.se350.extracredit.factory.FlightFactory;
import org.depaul.se350.extracredit.flights.Flight;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper m = new ObjectMapper();
		List flights = m.readValue(new File("src/resources/flightdata.txt"), new TypeReference<List>() {});
		
		for(Object x : flights) {
			System.out.println(flights);
		}

	}

}
