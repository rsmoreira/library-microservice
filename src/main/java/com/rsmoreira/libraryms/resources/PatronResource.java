package com.rsmoreira.libraryms.resources;

import org.springframework.hateoas.ResourceSupport;

import com.rsmoreira.libraryms.entities.Patron;

public class PatronResource extends ResourceSupport {

	private String lastName;

	private String firstName;

	private String streetAddress;

	private String cityStateZip;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCityStateZip() {
		return cityStateZip;
	}

	public void setCityStateZip(String cityStateZip) {
		this.cityStateZip = cityStateZip;
	}
	
	public Patron toPatron() {
		Patron patron = new Patron();
		patron.setFirstName(firstName);
		patron.setLastName(lastName);
		patron.setStreetAddress(streetAddress);
		patron.setCityStateZip(cityStateZip);
		return patron;
	}
	
}
