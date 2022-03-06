package org.depaul.se350.assignment4;

import java.util.Objects;

import org.depaul.se350.assignment4.exceptions.IllegalParameterException;

public class Airport {
	private String name;

	public Airport(String name) throws IllegalParameterException {
		setName(name);
	}

	private void setName(String name) throws IllegalParameterException {
		if(name.length() != 3) {
			throw new IllegalParameterException("Name should be exactly 3 characters");
		}
		for(char letter : name.toCharArray()) {
			if(!Character.isLetter(letter) || !Character.isUpperCase(letter)) {
				throw new IllegalParameterException("This is a bad parameter");
			}
		}
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(getName(), other.getName());
	}
	
	
	@Override
	public String toString() {
		return "Airport Name: " + getName();
	}
	
}

