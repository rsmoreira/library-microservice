package com.rsmoreira.libraryms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rsmoreira.libraryms.entities.Patron;

public interface PatronRepository extends CrudRepository<Patron, Long> {

}
