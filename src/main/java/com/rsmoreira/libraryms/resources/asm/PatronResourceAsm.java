package com.rsmoreira.libraryms.resources.asm;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.PatronController;
import com.rsmoreira.libraryms.entities.Patron;
import com.rsmoreira.libraryms.resources.PatronResource;

public class PatronResourceAsm extends ResourceAssemblerSupport<Patron, PatronResource> {

	public PatronResourceAsm() {
		super(PatronController.class, PatronResource.class);
	}

	@Override
	public PatronResource toResource(Patron patron) {
		PatronResource patronResource = new PatronResource();

		patronResource.setFirstName(patron.getFirstName());
		patronResource.setLastName(patron.getLastName());
		patronResource.setCityStateZip(patron.getCityStateZip());
		patronResource.setStreetAddress(patron.getStreetAddress());

		patronResource.add(linkTo(PatronController.class).slash(patron.getId()).withSelfRel());

		if (patron.getTransactions() != null) {
			patronResource.add(
					linkTo(PatronController.class).slash(patron.getId()).slash("transactions").withRel("transactions"));
		}

		return patronResource;
	}
}
