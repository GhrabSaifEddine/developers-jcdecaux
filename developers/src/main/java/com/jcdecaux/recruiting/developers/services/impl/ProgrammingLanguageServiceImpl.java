package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import com.jcdecaux.recruiting.developers.repositories.ProgrammingLanguageRepository;
import com.jcdecaux.recruiting.developers.services.ProgrammingLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

@Service
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {

	@Autowired
	private ProgrammingLanguageRepository repository;
	
	
	@Override
	public List<ProgrammingLanguage> getProgrammingLanguages() {
		return  (List<ProgrammingLanguage>) repository.findAll();
	}
	
	@Override
	public ProgrammingLanguage saveProgrammingLanguage(ProgrammingLanguage language) {
		repository.save(language);
        return language;
    }

}
