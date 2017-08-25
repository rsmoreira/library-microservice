package com.rsmoreira.libraryms.services;

import com.rsmoreira.libraryms.entities.Patron;

public interface PatronService {
	
    public Iterable<Patron> listAllPatrons();

    public Patron getPatronById(Long id);

    public Patron savePatron(Patron patron);

    public void deletePatron(Long id);
	
//	public List<Book> findByTitleContainingIgnoreCase(String partialTitle);
//	
//	public List<Book> findByAuthorFirstNameContainingIgnoreCase(String partialAuthorFirstName);
//	
//	public List<Book> findByAuthorLastNameContainingIgnoreCase(String partialAuthorLastName);
//	
//	public int countBooks(); 
}
