package com.example.demoSQL.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;

@Repository
public interface OfferDao extends JpaRepository<OfferDo, Long> {
	@Query("SELECT d FROM OfferDo d WHERE d.typeService =?1")
	public List<OfferDo> findByTypeService(String typeService);
	
	@Query("SELECT d FROM OfferDo d WHERE d.natureService =?1")
	public List<OfferDo> findByNatureService(String natureService);
	
	@Query("SELECT d FROM OfferDo d WHERE d.compteId =?1")
	public List<OfferDo> findByUserCompte(String compteId);
	
	@Query("SELECT d FROM OfferDo d WHERE d.description =?1")
	public List<OfferDo> findByDescription(String description);
	
	@Query("SELECT d FROM OfferDo d WHERE d.localisationService =?1")
	public List<OfferDo> findByLocalisationService(String localisationService);
	
	@Query("SELECT d FROM OfferDo d WHERE d.descriptionDetail =?1")
	public List<OfferDo> findByDescriptionDetail(String descriptionDetail);

	@Query("SELECT d FROM OfferDo d WHERE d.dateValidOffert =?1")
	public List<OfferDo> findByDateOffert(Date dateValidOffert);

	@Query("SELECT d FROM OfferDo d JOIN UserDo u ON d.compteId=u.userId WHERE u.pseudonyme =?1")
	public List<OfferDo> findByUserPseudonyme(String pseudonyme);
}
