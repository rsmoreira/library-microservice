package com.rsmoreira.libraryms.resources.util;

import java.util.ArrayList;
import java.util.List;

import com.rsmoreira.libraryms.entities.Transaction;

public class TransactionList {
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public TransactionList(List resultList) {
		this.transactions = resultList;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
