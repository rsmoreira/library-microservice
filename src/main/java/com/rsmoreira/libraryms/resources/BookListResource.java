package com.rsmoreira.libraryms.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

public class BookListResource extends ResourceSupport {

	private List<BookResource> books = new ArrayList<BookResource>();

	public List<BookResource> getBooks() {
		return books;
	}

	public void setBooks(List<BookResource> books) {
		this.books = books;
	}

}