package com.rsmoreira.libraryms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "LIBRARY_TUTORIAL", name = "PATRONS")
public class Patron implements Serializable {

	private static final long serialVersionUID = -3098228856716540501L;

	@Id
	@Column(name = "PATRON_ID")
	protected Long id;

	@Column(name = "LAST_NAME")
	protected String lastName;

	@Column(name = "FIRST_NAME")
	protected String firstName;

	@Column(name = "STREET_ADDRESS")
	protected String streetAddress;

	@Column(name = "CITY_STATE_ZIP")
	protected String cityStateZip;

	// TODO - Map Oracle SDO_GEOMETRY
	protected String location;

	@OneToMany(mappedBy="patron")
	protected List<Transaction> transactions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Patron: " + lastName + ", " + firstName);
		return sb.toString();
	}
}
