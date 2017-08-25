package com.rsmoreira.libraryms.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.PatronController;
import com.rsmoreira.libraryms.resources.PatronListResource;
import com.rsmoreira.libraryms.resources.util.PatronList;

public class PatronListResourceAsm extends ResourceAssemblerSupport<PatronList, PatronListResource> {

	public PatronListResourceAsm() {
		super(PatronController.class, PatronListResource.class);
	}

	@Override
	public PatronListResource toResource(PatronList patronList) {
		PatronListResource patronListResource = new PatronListResource();
		patronListResource.setPatrons(new PatronResourceAsm().toResources(patronList.getPatrons()));
		return patronListResource;
	}

}
