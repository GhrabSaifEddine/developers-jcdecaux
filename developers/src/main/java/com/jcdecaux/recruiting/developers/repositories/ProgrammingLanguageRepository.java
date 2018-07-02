package com.jcdecaux.recruiting.developers.repositories;

import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author GHRAB Saif Eddine
 */
public interface ProgrammingLanguageRepository extends CrudRepository<ProgrammingLanguage, String> {

    @Query("SELECT i.libelleLanguage FROM ProgrammingLanguage i")
    String getLibelleLanguage();
}
