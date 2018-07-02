package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.entities.AssociationLanguageDevelopper;
import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import com.jcdecaux.recruiting.developers.repositories.AsoociationLanguageDevelopperRepository;
import com.jcdecaux.recruiting.developers.services.AssociationLanguageDevelopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GHRAB Saif Eddine
 */

@Service
public class AssociationLanguageDevelopperServiceImpl implements AssociationLanguageDevelopperService {

    @Autowired
    private AsoociationLanguageDevelopperRepository repository;

    @Override
    public List<Developper> getAllDeveloppersByLanguage(int idLanguage) {
        return repository.getAllDeveloppersByLanguage(idLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAllLanguagesByDevelopper(int idDevelopper) {
        return repository.getAllLanguagesByDevelopper(idDevelopper);
    }

    @Override
    public AssociationLanguageDevelopper saveAssociationLanguageDevelopper(AssociationLanguageDevelopper association) {
        repository.save(association);
        return association;
    }

    @Override
    public List<AssociationLanguageDevelopper> getAllAssociations() {
        return (List<AssociationLanguageDevelopper>) repository.findAll();
    }


}
