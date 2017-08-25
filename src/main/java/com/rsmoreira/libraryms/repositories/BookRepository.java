package com.rsmoreira.libraryms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rsmoreira.libraryms.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
}
