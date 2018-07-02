package com.jcdecaux.recruiting.developers.services;

import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;

import java.util.List;

/**
 * 
 * @author GHRAB Saif Eddine
 *
 */

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getProgrammingLanguages();
	
	ProgrammingLanguage saveProgrammingLanguage(ProgrammingLanguage programme);
	
}
