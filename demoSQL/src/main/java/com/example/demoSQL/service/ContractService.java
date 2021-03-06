package com.example.demoSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.AcceptionServiceDo;
import com.example.demoSQL.domain.PropositionServiceDo;
import com.example.demoSQL.domain.UserDo;

@Service
public class ContractService {
	@Autowired
	private PropositionServiceDao psDao;
	@Autowired
	private UserDao ud;
	@Autowired 
	AcceptionServiceDao asDao;
	
	
	public void stockPsDo(PropositionServiceDo ps) {
		psDao.save(ps);
	}
	public List<PropositionServiceDo> getPrositions(String demandCompte){
		return psDao.findByDemandCompte(demandCompte);
	}
	
	public UserDo getUser(String compte) {
		return ud.getOne(compte);
	}
	
	public List<AcceptionServiceDo> getAcception(String compteId){
		return asDao.findByOfferCompte(compteId);
	}
	
	public void stockAcceptionDo(AcceptionServiceDo as) {
		asDao.save(as);
	}

}
