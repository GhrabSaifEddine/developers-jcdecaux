package com.jcdecaux.recruiting.developers.services;


import com.jcdecaux.recruiting.developers.entities.AssociationLanguageDevelopper;
import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;

import java.util.List;

/**
 * @author GHRAB Saif Eddine
 */

public interface AssociationLanguageDevelopperService {

    List<Developper> getAllDeveloppersByLanguage(int idLanguage);

    List<ProgrammingLanguage> getAllLanguagesByDevelopper(int idDevelopper);

    List<AssociationLanguageDevelopper> getAllAssociations();

    AssociationLanguageDevelopper saveAssociationLanguageDevelopper(AssociationLanguageDevelopper association);

}
