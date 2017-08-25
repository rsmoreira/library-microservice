package com.rsmoreira.libraryms.resources.asm;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.BookController;
import com.rsmoreira.libraryms.controllers.PatronController;
import com.rsmoreira.libraryms.controllers.TransactionController;
import com.rsmoreira.libraryms.entities.Transaction;
import com.rsmoreira.libraryms.resources.TransactionResource;

public class TransactionResourceAsm extends ResourceAssemblerSupport<Transaction, TransactionResource>{

	public TransactionResourceAsm() {
		super(TransactionController.class, TransactionResource.class);
	}
	
	@Override
	public TransactionResource toResource(Transaction transaction) {
		TransactionResource transactionResource = new TransactionResource();
		transactionResource.setTransactionId(transaction.getId());
		transactionResource.setTransactionDate(transaction.getTransactionDate());
		transactionResource.setTransactionType(transaction.getTransactionType());
		if (transaction.getBook() != null) {
			transactionResource.setBookInfo(transaction.getBook().toString());
			transactionResource.add(linkTo(BookController.class).slash(
					transaction.getBook().getId()).withRel("book"));
		}
		if (transaction.getPatron() != null) {
			transactionResource.setPatronInfo(transaction.getPatron().toString());
			transactionResource.add(linkTo(PatronController.class).slash(
					transaction.getPatron().getId()).withRel("patron"));
		}
		transactionResource.add(linkTo(TransactionController.class).slash(transaction.getId())
				.withSelfRel());
		return transactionResource;
	}

}
