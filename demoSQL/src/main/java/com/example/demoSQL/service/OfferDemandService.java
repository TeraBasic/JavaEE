package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;

@Service
public class OfferDemandService {
	@Autowired
	private OfferDao offerDao;
	@Autowired
	private DemandeDao dd;
	public OfferDo getOneOffer(Long id) {
		return this.offerDao.getOne(id);
	}
	
	public List<OfferDo> getAllOffer(){
		return this.offerDao.findAll();
	}
	
	public DemandeDo getOneDemande(Long id) {
		return this.dd.getOne(id);
	}
	public List<DemandeDo> getAllDemande(){
		return this.dd.findAll();
	}

}
