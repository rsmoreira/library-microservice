package com.rsmoreira.libraryms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rsmoreira.libraryms.entities.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
	
}
