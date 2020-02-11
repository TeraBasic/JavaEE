package com.example.demoSQL.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;


@Service
public class DemandeService {
	@Autowired
    private DemandeDao demandeDao;
	@PersistenceContext
    private EntityManager entityManager;

	
	public void stockDemande(DemandeDo ud) {
		demandeDao.save(ud);
	}

}
