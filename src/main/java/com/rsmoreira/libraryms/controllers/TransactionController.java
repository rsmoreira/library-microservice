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
import com.rsmoreira.libraryms.entities.Transaction;
import com.rsmoreira.libraryms.repositories.TransactionRepository;
import com.rsmoreira.libraryms.resources.TransactionListResource;
import com.rsmoreira.libraryms.resources.TransactionResource;
import com.rsmoreira.libraryms.resources.asm.TransactionListResourceAsm;
import com.rsmoreira.libraryms.resources.asm.TransactionResourceAsm;
import com.rsmoreira.libraryms.resources.util.TransactionList;

@RestController
@RequestMapping("/library/transactions")
public class TransactionController {

	protected Logger logger = Logger.getLogger(TransactionController.class.getName());
	
	@Autowired
	protected TransactionRepository transactionRepository;
	
	@RequestMapping("/findAll")
    public ResponseEntity<TransactionListResource> findAll(){
        logger.info("findAll() method invoked.");
		
        TransactionList transactionList = new TransactionList(Lists.newArrayList(transactionRepository.findAll()));
        TransactionListResource transactionListResource = new TransactionListResourceAsm().toResource(transactionList);
        
		return new ResponseEntity<TransactionListResource>(transactionListResource, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/{transactionId}", method = RequestMethod.GET)
	public ResponseEntity<TransactionResource> findById(@PathVariable Long transactionId) {
		logger.info(this.getClass().getName() + " findById ");

		Transaction transaction = transactionRepository.findOne(transactionId);

		if (transaction != null) {
			TransactionResource transactionResouce = new TransactionResourceAsm().toResource(transaction);
			return new ResponseEntity<TransactionResource>(transactionResouce, HttpStatus.OK);
		} else {
			return new ResponseEntity<TransactionResource>(HttpStatus.NOT_FOUND);
		}
	}

}
