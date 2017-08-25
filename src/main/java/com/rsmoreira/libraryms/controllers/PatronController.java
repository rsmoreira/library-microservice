package com.rsmoreira.libraryms.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.rsmoreira.libraryms.entities.Patron;
import com.rsmoreira.libraryms.repositories.PatronRepository;
import com.rsmoreira.libraryms.resources.PatronListResource;
import com.rsmoreira.libraryms.resources.PatronResource;
import com.rsmoreira.libraryms.resources.TransactionListResource;
import com.rsmoreira.libraryms.resources.asm.PatronListResourceAsm;
import com.rsmoreira.libraryms.resources.asm.PatronResourceAsm;
import com.rsmoreira.libraryms.resources.asm.TransactionListResourceAsm;
import com.rsmoreira.libraryms.resources.util.PatronList;
import com.rsmoreira.libraryms.resources.util.TransactionList;

@RestController
@RequestMapping("/library/patrons")
public class PatronController {

	protected Logger logger = Logger.getLogger(PatronController.class.getName());
	
	@Autowired
	protected PatronRepository patronRepository;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<PatronListResource> findAll(){
        logger.info("findAll() method invoked.");
		
        PatronList patronList = new PatronList(Lists.newArrayList(patronRepository.findAll()));
        PatronListResource patronListResource = new PatronListResourceAsm().toResource(patronList);
        
		return new ResponseEntity<PatronListResource>(patronListResource, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/{patronId}", method = RequestMethod.GET)
	public ResponseEntity<PatronResource> findById(@PathVariable Long patronId) {
		logger.info(this.getClass().getName() + " findById ");

		Patron patron = patronRepository.findOne(patronId);

		if (patron != null) {
			PatronResource patronResource = new PatronResourceAsm().toResource(patron);
			return new ResponseEntity<PatronResource>(patronResource, HttpStatus.OK);
		} else {
			return new ResponseEntity<PatronResource>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/{patronId}/transactions")
	public ResponseEntity<TransactionListResource> findAllTransactions(@PathVariable Long patronId) {

		logger.info(this.getClass().getName() + " findAllTransactions ");

		Patron patron = patronRepository.findOne(patronId);

		if (patron != null && patron.getTransactions() != null) {
			TransactionList transactionList = new TransactionList(patron.getTransactions());
			TransactionListResource transactionListResource = new TransactionListResourceAsm()
					.toResource(transactionList);
			return new ResponseEntity<TransactionListResource>(transactionListResource, HttpStatus.OK);
		}

		return new ResponseEntity<TransactionListResource>(HttpStatus.NOT_FOUND);
	}
}
