package com.example.demoSQL.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.UserDo;

@Service
public class RechercheService {
	@Autowired
    private DemandeDao DemandeDao;
	@PersistenceContext
    private EntityManager entityManager;

	public DemandeDo getOneDemandeById(Long id) {
		return this.DemandeDao.getOne(id);
	}
	public List<DemandeDo> getOneDemandeByTypeService(String typeService) {
		return this.DemandeDao.findByTypeService(typeService);
	}
	public List<DemandeDo> getOneDemandeByNatureService(String natureService) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByNatureService(natureService);
	}
	public List<DemandeDo> getOneDemandeByUserCompte(String compteId) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByUserCompte(compteId);
	}
	public List<DemandeDo> getOneDemandeByDescrption(String description) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByDescription(description);
	}
	public List<DemandeDo> getOneDemandeByLocalisationService(String localisationService) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByLocalisationService(localisationService);
		
	}
	
	public List<DemandeDo> getOneDemandeByDescriptionDetail(String descriptionDetail) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByDescriptionDetail(descriptionDetail);
		
	}
	public List<DemandeDo> getOneDemandeByDateValidDemande(Date dateValidDemande) {
		// TODO Auto-generated method stub
		return this.DemandeDao.findByDateValidDemande(dateValidDemande);
		
	}
}
