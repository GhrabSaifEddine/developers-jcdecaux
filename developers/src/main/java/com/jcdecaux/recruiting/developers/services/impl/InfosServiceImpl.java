package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.repositories.InfosRepository;
import com.jcdecaux.recruiting.developers.services.InfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfosServiceImpl implements InfosService {

	@Autowired
	private InfosRepository repository;
	
	public String getCurrentVersion() {
		return repository.getVersion();
	}

}
