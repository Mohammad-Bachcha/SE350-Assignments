package org.depaul.se350.assignment1;

import java.util.Objects;
import org.depaul.se350.assignment1.exceptions.IllegalParameterException;

public class Airline {
	private String name;
	

	public Airline(String name) throws IllegalParameterException {
		setName(name);
	}

	private void setName(String name) throws IllegalParameterException {
		if(name.length() >= 8) {
			throw new IllegalParameterException("Entered parameter exceeds the length allowed"); 
		}
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Airline Name: " + getName();
	}
	
}
