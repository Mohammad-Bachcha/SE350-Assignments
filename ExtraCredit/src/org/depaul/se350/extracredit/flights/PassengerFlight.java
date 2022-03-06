package org.depaul.se350.extracredit.flights;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import org.depaul.se350.extracredit.Airline;
import org.depaul.se350.extracredit.Airport;
import org.depaul.se350.extracredit.exceptions.IllegalParameterException;

public class PassengerFlight implements Flight {
	
	private Airline airline;
	private Airport origin;
	private Airport destination;
	private String flightNumber;
	private int flightCapacity;
	private Date departureTime;
	
	public PassengerFlight() {
		
	}
	public PassengerFlight(Airline airline, int capacity, Airport origin, Airport destination, Date departureTime) throws IllegalParameterException {
		setAirline(airline);
		setOrigin(origin);
		setDestination(destination);
		setFlightNumber();
		setDepartureTime(departureTime);
		setCapacity(capacity);
	}
	
	
	private void setCapacity(int capacity) throws IllegalParameterException {
		if(capacity <= 0 || capacity > 900) {
			throw new IllegalParameterException("The specified capacity is not possible");
		}
		this.flightCapacity = capacity;	
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
		return Objects.hash(getAirline(), getDepartureTime(), getDestination(), getFlightNumber(), getOrigin());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassengerFlight other = (PassengerFlight) obj;
		return Objects.equals(getAirline(), other.getAirline()) && Objects.equals( getDepartureTime(), other. getDepartureTime())
				&& Objects.equals(getDestination(), other.getDestination()) && Objects.equals(getFlightNumber(), other.getFlightNumber())
				&& Objects.equals(getOrigin(), other.getOrigin());
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
