package com.rsmoreira.libraryms.resources.util;

import java.util.ArrayList;
import java.util.List;

import com.rsmoreira.libraryms.entities.Book;

public class BookList {
	private List<Book> books = new ArrayList<Book>();

	public BookList(List resultList) {
		this.books = resultList;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
