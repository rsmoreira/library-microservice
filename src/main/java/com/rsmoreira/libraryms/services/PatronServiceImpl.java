package com.rsmoreira.libraryms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsmoreira.libraryms.entities.Patron;
import com.rsmoreira.libraryms.repositories.PatronRepository;

@Service
public class PatronServiceImpl implements PatronService {
    
	@Autowired
	private PatronRepository patronRepository;

    @Override
    public Iterable<Patron> listAllPatrons() {
        return patronRepository.findAll();
    }

    @Override
    public Patron getPatronById(Long id) {
        return patronRepository.findOne(id);
    }

    @Override
    public Patron savePatron(Patron patron) {
        return patronRepository.save(patron);
    }

    @Override
    public void deletePatron(Long id) {
    	patronRepository.delete(id);
    }
}
