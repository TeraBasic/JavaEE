package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.OfferDo;

@Service
public class OfferService {
	@Autowired
	private OfferDao offerDao;
	
	public OfferDo getOneOffer(Long id) {
		return this.offerDao.getOne(id);
	}
	
	public List<OfferDo> getAllService(){
		return this.offerDao.findAll();
	}
}