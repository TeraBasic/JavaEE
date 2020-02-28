package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;

@Service
public class OfferDemandService {
	@Autowired
	private OfferDao od;
	@Autowired
	private DemandeDao dd;
	@Autowired
	private UserDao ud;
	
	public OfferDo getOneOffer(Long id) {
		return this.od.getOne(id);
	}
	
	public List<OfferDo> getAllOffer(){
		return this.od.findAll();
	}
	
	public DemandeDo getOneDemande(Long id) {
		return this.dd.getOne(id);
	}
	public List<DemandeDo> getAllDemande(){
		return this.dd.findAll();
	}
	
	public List<DemandeDo> getAllDemandOneUser(String compteId){
		if(ud.getOne(compteId).getUserType().equals("Administrateur")) {
			return this.dd.findByEtatDemande("A_VALIDER");
		} else {
			return this.dd.findByUserCompte(compteId);
		}
	}
	
	public List<OfferDo> getAllOfferOneUser(String userCompte){
		if(ud.getOne(userCompte).getUserType().equals("Administrateur")) {
			return this.od.findByEtatService("A_VALIDER");
		} else {
		return this.od.findByUserCompte(userCompte);
		}
	}
	
	public void updateOffer(OfferDo od) {
		this.od.saveAndFlush(od);
	}
	public void updateDemande(DemandeDo dd) {
		this.dd.saveAndFlush(dd);
	}

}
