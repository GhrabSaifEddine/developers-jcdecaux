package com.jcdecaux.recruiting.developers.repositories;

import com.jcdecaux.recruiting.developers.entities.Infos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface InfosRepository extends Repository<Infos, String> {

	@Query("SELECT i.version FROM Infos i")
	String getVersion();
}
