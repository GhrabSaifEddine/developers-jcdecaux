package com.jcdecaux.recruiting.developers.repositories;

import com.jcdecaux.recruiting.developers.entities.Developper;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author GHRAB Saif Eddine
 */
public interface DevelopperRepository extends CrudRepository<Developper, String> {

    @Query("SELECT d.nomDevelopper FROM Developper d")
    String getNomDevelopper();
}
