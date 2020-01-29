package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;

@Service
public class OfferDemandService {
	@Autowired
	private OfferDao_Y offerDao_Y;
	@Autowired
	private DemandeDao dd;
	public OfferDo getOneOffer(String id) {
		return this.offerDao_Y.getOne(id);
	}
	
	public List<OfferDo> getAllOffer(){
		return this.offerDao_Y.findAll();
	}
	
	public DemandeDo getOneDemande(int id) {
		return this.dd.getOne((long) id);
	}
	public List<DemandeDo> getAllDemande(){
		return this.dd.findAll();
	}

}
