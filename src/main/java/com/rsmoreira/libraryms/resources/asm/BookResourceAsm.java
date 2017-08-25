package com.rsmoreira.libraryms.resources.asm;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.rsmoreira.libraryms.controllers.BookController;
import com.rsmoreira.libraryms.entities.Book;
import com.rsmoreira.libraryms.resources.BookResource;

public class BookResourceAsm extends ResourceAssemblerSupport<Book, BookResource> {

	public BookResourceAsm() {
		super(BookController.class, BookResource.class);
	}

	@Override
	public BookResource toResource(Book book) {
		BookResource bookResource = new BookResource();

		bookResource.setTitle(book.getTitle());
		bookResource.setAuthorFirstName(book.getAuthorFirstName());
		bookResource.setAuthorLastName(book.getAuthorLastName());
		bookResource.setRating(book.getRating());
		bookResource.add(linkTo(BookController.class).slash(book.getId()).withSelfRel());
		bookResource.add(linkTo(BookController.class).slash("findAll").withRel("findAll"));
		if (book.getTransactions() != null) {
			bookResource.add(
					linkTo(BookController.class).slash(book.getId()).slash("transactions").withRel("transactions"));
		}
		return bookResource;
	}

}
