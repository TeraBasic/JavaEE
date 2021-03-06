package com.example.demoSQL.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.*;
@Repository
public interface PropositionServiceDao extends JpaRepository<PropositionServiceDo, Long> {
	@Query("SELECT d FROM PropositionServiceDo d WHERE d.demandCompte =?1")
	public List<PropositionServiceDo> findByDemandCompte(String demandCompte);

}
