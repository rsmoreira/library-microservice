package com.rsmoreira.libraryms.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class PatronListResource extends ResourceSupport {

	private List<PatronResource> patrons = new ArrayList<PatronResource>();

	public List<PatronResource> getPatrons() {
		return patrons;
	}

	public void setPatrons(List<PatronResource> patrons) {
		this.patrons = patrons;
	}
	
	
	
}
