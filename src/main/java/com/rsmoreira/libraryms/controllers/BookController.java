package com.rsmoreira.libraryms.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.rsmoreira.libraryms.entities.Book;
import com.rsmoreira.libraryms.repositories.BookRepository;
import com.rsmoreira.libraryms.resources.BookListResource;
import com.rsmoreira.libraryms.resources.BookResource;
import com.rsmoreira.libraryms.resources.TransactionListResource;
import com.rsmoreira.libraryms.resources.asm.BookListResourceAsm;
import com.rsmoreira.libraryms.resources.asm.BookResourceAsm;
import com.rsmoreira.libraryms.resources.asm.TransactionListResourceAsm;
import com.rsmoreira.libraryms.resources.util.BookList;
import com.rsmoreira.libraryms.resources.util.TransactionList;

@RestController
@RequestMapping("/library/books")
public class BookController {

	protected Logger logger = Logger.getLogger(BookController.class.getName());

	@Autowired
	protected BookRepository bookRepository;

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public ResponseEntity<BookListResource> findAll() {
		logger.info(this.getClass().getName() + " findAll() ");

		BookList bookList = new BookList(Lists.newArrayList(bookRepository.findAll()));
		BookListResource bookListRes = new BookListResourceAsm().toResource(bookList);
		return new ResponseEntity<BookListResource>(bookListRes, HttpStatus.OK);
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	public ResponseEntity<BookResource> findById(@PathVariable Long bookId) {
		logger.info(this.getClass().getName() + " findById ");

		Book book = bookRepository.findOne(bookId);

		if (book != null) {
			BookResource bookResource = new BookResourceAsm().toResource(book);
			return new ResponseEntity<BookResource>(bookResource, HttpStatus.OK);
		} else {
			return new ResponseEntity<BookResource>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{bookId}/transactions")
	public ResponseEntity<TransactionListResource> findAllTransactions(@PathVariable Long bookId) {

		logger.info(this.getClass().getName() + " findAllTransactions ");

		Book book = bookRepository.findOne(bookId);

		if (book != null && book.getTransactions() != null) {
			TransactionList transactionList = new TransactionList(book.getTransactions());
			TransactionListResource transactionListResource = new TransactionListResourceAsm()
					.toResource(transactionList);
			return new ResponseEntity<TransactionListResource>(transactionListResource, HttpStatus.OK);
		}

		return new ResponseEntity<TransactionListResource>(HttpStatus.NOT_FOUND);
	}
}
