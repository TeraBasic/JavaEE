package com.example.demoSQL.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demoSQL.domain.AcceptionServiceDo;
import com.example.demoSQL.domain.PropositionServiceDo;


@Repository
public interface AcceptionServiceDao extends JpaRepository<AcceptionServiceDo, Long> {
	@Query("SELECT d FROM AcceptionServiceDo d WHERE d.compteId =?1")
	public List<AcceptionServiceDo> findByOfferCompte(String compteId);

}
