package com.rsmoreira.libraryms.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.TransactionController;
import com.rsmoreira.libraryms.resources.TransactionListResource;
import com.rsmoreira.libraryms.resources.util.TransactionList;

public class TransactionListResourceAsm extends ResourceAssemblerSupport<TransactionList, TransactionListResource> {

	public TransactionListResourceAsm() {
		super(TransactionController.class, TransactionListResource.class);
	}

	@Override
	public TransactionListResource toResource(TransactionList transactionList) {
		TransactionListResource transactionListResource = new TransactionListResource();
		transactionListResource
				.setTransactions(new TransactionResourceAsm().toResources(transactionList.getTransactions()));
		return transactionListResource;
	}

}
