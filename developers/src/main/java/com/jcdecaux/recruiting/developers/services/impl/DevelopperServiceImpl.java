package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.repositories.DevelopperRepository;
import com.jcdecaux.recruiting.developers.services.DevelopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author GHRAB Saif Eddine
 */

@Service
public class DevelopperServiceImpl implements DevelopperService {

    @Autowired
    private DevelopperRepository repository;


    @Override
    public List<Developper> getAllDeveloppers() {
        return (List<Developper>) repository.findAll();
    }

    @Override
    public Developper saveDevelopper(Developper developper) {
        repository.save(developper);
        return developper;
    }

    @Override
    public Optional<Developper> findBYId(int idDevelopper){
        return repository.findById(String.valueOf(idDevelopper));
    }

}
