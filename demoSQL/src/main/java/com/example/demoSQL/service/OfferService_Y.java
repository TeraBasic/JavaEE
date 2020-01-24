package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.OfferDo_Y;

@Service
public class OfferService_Y {
	@Autowired
	private OfferDao_Y offerDao_Y;
	
	public OfferDo_Y getOneService(String id) {
		return this.offerDao_Y.getOne(id);
	}
	
	public List<OfferDo_Y> getAllService(){
		return this.offerDao_Y.findAll();
	}
	

}
