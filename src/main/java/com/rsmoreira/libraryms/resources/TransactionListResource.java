package com.rsmoreira.libraryms.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class TransactionListResource extends ResourceSupport {

	private List<TransactionResource> transactions = new ArrayList<TransactionResource>();

	public List<TransactionResource> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionResource> transactions) {
		this.transactions = transactions;
	}

}