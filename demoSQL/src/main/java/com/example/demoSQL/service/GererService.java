package com.example.demoSQL.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.UserDo;
@Service
public class GererService {
	
	@Autowired
    private DemandeDao demandeDao;
	@Autowired
    private OfferDao offerDao;
	
	public void supprimeDemande(Long id) {
		demandeDao.deleteById(id);
	}
	public void supprimeOffer(Long id) {
		offerDao.deleteById(id);
	}
	

}
