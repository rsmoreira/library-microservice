package com.rsmoreira.libraryms.services;

import com.rsmoreira.libraryms.entities.Book;

public interface BookService {
	
    public Iterable<Book> listAllBooks();

    public Book getBookById(Long id);

    public Book saveBook(Book product);

    public void deleteBook(Long id);
	
//	public List<Book> findByTitleContainingIgnoreCase(String partialTitle);
//	
//	public List<Book> findByAuthorFirstNameContainingIgnoreCase(String partialAuthorFirstName);
//	
//	public List<Book> findByAuthorLastNameContainingIgnoreCase(String partialAuthorLastName);
//	
//	public int countBooks(); 
}
