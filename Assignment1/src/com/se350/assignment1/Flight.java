package com.se350.assignment1;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import com.se350.exceptions.IllegalParameterException;

public class Flight {
	
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private Date departureTime;
	
	public Flight(Airline airline, Airport origin, Airport destination, Date departureTime) throws IllegalParameterException {
		setAirline(airline);
		setOrigin(origin);
		setDestination(destination);
		setFlightNumber();
		setDepartureTime(departureTime);
	}
	
	
	private void setAirline(Airline airline) throws IllegalParameterException {
		if(airline == null) {
			throw new IllegalParameterException("Airline cannot be null");
		}
		this.airline = airline;
	}
	private void setOrigin(Airport origin) throws IllegalParameterException {
		if(origin == null) {
			throw new IllegalParameterException("Origin Airport cannot be null");
		}
		this.origin = origin;
	}
	private void setDestination(Airport destination) throws IllegalParameterException {
		if(destination == null) {
			throw new IllegalParameterException("Destination Airport cannot be null");
		}
		this.destination = destination;
	}
	private void setFlightNumber() {
		String uuid = UUID.randomUUID().toString();
		this.flightNumber = uuid;
	}
	private void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	
	
	public Airline getAirline() {
		return airline;
	}
	public Airport getOrigin() {
		return origin;
	}
	public Airport getDestination() {
		return destination;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(airline, departureTime, destination, flightNumber, origin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(airline, other.airline) && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightNumber, other.flightNumber)
				&& Objects.equals(origin, other.origin);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAirline() + "\n");
		sb.append("Origin " + getOrigin() + "\n");
		sb.append("Destination " + getDestination() + "\n");
		sb.append("Flight Number: " + getFlightNumber() + "\n");
		sb.append("Departure Time: " + getDepartureTime() + "\n");
		return sb.toString();
	}

	
}
