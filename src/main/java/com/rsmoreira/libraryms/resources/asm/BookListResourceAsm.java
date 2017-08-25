package com.rsmoreira.libraryms.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.BookController;
import com.rsmoreira.libraryms.resources.BookListResource;
import com.rsmoreira.libraryms.resources.util.BookList;

public class BookListResourceAsm extends ResourceAssemblerSupport<BookList, BookListResource> {

	public BookListResourceAsm() {
		super(BookController.class, BookListResource.class);
	}

	@Override
	public BookListResource toResource(BookList bookList) {
		BookListResource bookListResouce = new BookListResource();
		bookListResouce.setBooks(new BookResourceAsm().toResources(bookList.getBooks()));
		return bookListResouce;
	}

}
