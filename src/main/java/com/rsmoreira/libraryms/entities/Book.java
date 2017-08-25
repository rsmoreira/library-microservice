package com.rsmoreira.libraryms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "LIBRARY_TUTORIAL", name = "BOOKS")
public class Book implements Serializable {

	private static final long serialVersionUID = 498671762261649279L;

	@Id
	@Column(name = "BOOK_ID")
	protected Long id;

	protected String title;

	@Column(name = "AUTHOR_FIRST_NAME")
	protected String authorFirstName;

	@Column(name = "AUTHOR_LAST_NAME")
	protected String authorLastName;

	protected String rating;

	@OneToMany(mappedBy="book")
	protected List<Transaction> transactions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Title: " + this.title + "; ");
		sb.append("Author: " + this.authorLastName );
		sb.append(", " + this.authorFirstName);
		return sb.toString();
	}
}
