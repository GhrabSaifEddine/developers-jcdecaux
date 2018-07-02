package com.jcdecaux.recruiting.developers.services;

import com.jcdecaux.recruiting.developers.entities.Developper;

import java.util.List;
import java.util.Optional;

/**
 * @author GHRAB Saif Eddine
 */

public interface DevelopperService {

    List<Developper> getAllDeveloppers();

    Developper saveDevelopper(Developper developper);

    Optional<Developper> findBYId(int idDevelopper);

}
