package com.rsmoreira.libraryms.resources;

import java.util.Date;

import org.springframework.hateoas.ResourceSupport;

import com.rsmoreira.libraryms.entities.Transaction;

public class TransactionResource extends ResourceSupport {

	protected Long transactionId;

	protected Date transactionDate;

	protected Long transactionType;

	protected String bookInfo;
	
	protected String patronInfo;
	
	public Transaction toTransaction() {
		Transaction transaction = new Transaction();
		transaction.setId(transactionId);
		transaction.setTransactionDate(transactionDate);
		transaction.setTransactionType(transactionType);
		return transaction;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Long getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Long transactionType) {
		this.transactionType = transactionType;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getPatronInfo() {
		return patronInfo;
	}

	public void setPatronInfo(String patronInfo) {
		this.patronInfo = patronInfo;
	}
}
