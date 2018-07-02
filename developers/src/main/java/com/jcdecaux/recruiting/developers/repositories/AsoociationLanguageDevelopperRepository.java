package com.jcdecaux.recruiting.developers.repositories;

import com.jcdecaux.recruiting.developers.entities.AssociationLanguageDevelopper;
import com.jcdecaux.recruiting.developers.entities.Developper;
import com.jcdecaux.recruiting.developers.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author GHRAB Saif Eddine
 */
public interface AsoociationLanguageDevelopperRepository extends CrudRepository<AssociationLanguageDevelopper, String> {

    @Query("SELECT dev From Developper dev where  dev.idDevelopper in ( select   assoc.developper.idDevelopper from  AssociationLanguageDevelopper assoc where assoc.programmingLanguage.idLanguage=:idLanguage)")
    List<Developper> getAllDeveloppersByLanguage(@Param("idLanguage") int idLanguage);

    @Query("SELECT lang From ProgrammingLanguage lang where  lang.idLanguage in ( select   assoc.programmingLanguage.idLanguage from  AssociationLanguageDevelopper assoc where assoc.developper.idDevelopper=:idDevelopper)")
    List<ProgrammingLanguage> getAllLanguagesByDevelopper(@Param("idDevelopper") int idDevelopper);

}
