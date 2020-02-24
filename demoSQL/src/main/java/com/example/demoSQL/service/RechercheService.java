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
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;

@Service
public class RechercheService {
	@Autowired
    private DemandeDao DemandeDao;
	@Autowired
    private OfferDao OfferDao;
	
	@PersistenceContext
    private EntityManager entityManager;

	public DemandeDo getOneDemandeById(Long id) {
		return this.DemandeDao.getOne(id);
	}
	public List<DemandeDo> getOneDemandeByTypeService(String typeService) {
		return this.DemandeDao.findByTypeService(typeService);
	}
	public List<DemandeDo> getOneDemandeByNatureService(String natureService) {
		return this.DemandeDao.findByNatureService(natureService);
	}
	public List<DemandeDo> getOneDemandeByUserPseudonyme(String pseudonyme) {
		return this.DemandeDao.findByUserPseudonyme(pseudonyme);
	}
	public List<DemandeDo> getOneDemandeByDescrption(String description) {
		return this.DemandeDao.findByDescription(description);
	}
	public List<DemandeDo> getOneDemandeByLocalisationService(String localisationService) {
		return this.DemandeDao.findByLocalisationService(localisationService);
		
	}
	
	public List<DemandeDo> getOneDemandeByDescriptionDetail(String descriptionDetail) {
		return this.DemandeDao.findByDescriptionDetail(descriptionDetail);
		
	}
	public List<DemandeDo> getOneDemandeByDateValidDemande(Date dateValidDemande) {
		return this.DemandeDao.findByDateValidDemande(dateValidDemande);
		
	}
	
	public OfferDo getOneOffertById(Long id){
		return this.OfferDao.getOne(id);
	}
	public List<OfferDo> getOneOffertByTypeService(String typeService) {
		return this.OfferDao.findByTypeService(typeService);
	}
	public List<OfferDo> getOneOffertByNatureService(String natureService) {
		return this.OfferDao.findByNatureService(natureService);
	}
	public List<OfferDo> getOneOffertByUserPseudonyme(String pseudonyme) {
		return this.OfferDao.findByUserPseudonyme(pseudonyme);
	}
	public List<OfferDo> getOneOffertByDescrption(String description) {
		return this.OfferDao.findByDescription(description);
	}
	public List<OfferDo> getOneOffertByLocalisationService(String localisationService) {
		return this.OfferDao.findByLocalisationService(localisationService);
		
	}
	public List<OfferDo> getOneOffertByDescriptionDetail(String descriptionDetail) {
		return this.OfferDao.findByDescriptionDetail(descriptionDetail);	
	}
	public List<OfferDo> getOneOffertByDateValidOffert(Date dateValidOffert) {
		return this.OfferDao.findByDateOffert(dateValidOffert);
		
	}
}
