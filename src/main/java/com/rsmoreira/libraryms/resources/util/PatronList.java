package com.rsmoreira.libraryms.resources.util;

import java.util.ArrayList;
import java.util.List;

import com.rsmoreira.libraryms.entities.Patron;

public class PatronList {

	private List<Patron> patrons = new ArrayList<Patron>();

	public PatronList(List patrons) {
		this.patrons = patrons;
	}
	
	public List<Patron> getPatrons() {
		return patrons;
	}

	public void setPatrons(List<Patron> patrons) {
		this.patrons = patrons;
	}

}
