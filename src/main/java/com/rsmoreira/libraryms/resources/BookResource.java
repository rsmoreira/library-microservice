package com.rsmoreira.libraryms.resources;

import org.springframework.hateoas.ResourceSupport;

import com.rsmoreira.libraryms.entities.Book;

public class BookResource extends ResourceSupport {
	
	private String title;

	private String authorFirstName;

	private String authorLastName;

	private String rating;

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
	
	public Book toBook() {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthorFirstName(authorFirstName);
		book.setAuthorLastName(authorLastName);
		book.setRating(rating);
		return book;
	}
	
}
