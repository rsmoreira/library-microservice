package com.rsmoreira.libraryms.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="LIBRARY_TUTORIAL", name = "TRANSACTIONS")
public class Transaction implements Serializable {

	private static final long serialVersionUID = -5991832162257155905L;

	@Id
	@Column(name = "TRANSACTION_ID")
	protected Long id;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "PATRON_ID")
	protected Patron patron;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "BOOK_ID")
	protected Book book;

	@Column(name = "TRANSACTION_DATE")
	protected Date transactionDate;

	@Column(name = "TRANSACTION_TYPE")
	protected Long transactionType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patron getPatron() {
		return patron;
	}

	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
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

}
